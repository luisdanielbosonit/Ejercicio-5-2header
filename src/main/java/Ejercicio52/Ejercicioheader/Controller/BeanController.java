package Ejercicio52.Ejercicioheader.Controller;

import Ejercicio52.Ejercicioheader.Models.Beans;
import Ejercicio52.Ejercicioheader.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controlador")
public class BeanController {

    Person person;

    @GetMapping("/bean/bean1")
    @Qualifier("Bean1")
    public Person getBean1(){
        Person person1=new Person();
        person1.setName("Luis Daniel");
        person1.setCity("Madrid");
        person1.setAge(34);
        return person1;
    }


    @GetMapping("/bean/bean2")
    @Qualifier("Bean2")
    public Person getBean2(){
        Person person2 = new Person();
        person2.setName("Daniella");
        person2.setCity("Barcelona");
        person2.setAge(4);
        return person2;
    }

    @GetMapping("/bean/bean3")
    @Qualifier("Bean3")
    public Person getBean3(){
        Person person3 = new Person();
        person3.setName("Delany");
        person3.setCity("Sevilla");
        person3.setAge(32);
        return person3;
    }



}

package Ejercicio52.Ejercicioheader.Controller;

import Ejercicio52.Ejercicioheader.Models.Person;
import Ejercicio52.Ejercicioheader.Service.ServicePerson;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador2")
public class Controller2 {

    @Autowired
    ServicePerson servicePerson;

    Person person;

    @GetMapping("/getPerson")
    public Person viewperson(){
                   person.setAge(person.getAge() * 2);
        return person;
    }




}

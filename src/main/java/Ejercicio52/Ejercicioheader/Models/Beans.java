package Ejercicio52.Ejercicioheader.Models;

import org.springframework.context.annotation.Bean;

public class Beans {

    @Bean
    public Person getBean1(){
        Person person1=new Person();
        return person1;
    }


    @Bean
    public Person getBean2() {
        Person person2 = new Person();
        return person2;
    }

    @Bean
    public Person getBean3(){
        Person person3 = new Person();
        return person3;
    }


}


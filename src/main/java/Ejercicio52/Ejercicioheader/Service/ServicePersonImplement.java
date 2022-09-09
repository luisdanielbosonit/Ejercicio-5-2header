package Ejercicio52.Ejercicioheader.Service;

import Ejercicio52.Ejercicioheader.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePersonImplement implements ServicePerson{
   private Person person;



    @Override
    public Person viewperson(String name, String city, int age) {
        return person;
    }

    @Override
    public void getPerson(Person person) {

    }
}


package Ejercicio52.Ejercicioheader.Service;

import Ejercicio52.Ejercicioheader.Models.Person;



public interface ServicePerson {

    public Person viewperson(String name, String city, int age);

   public void getPerson(Person person);
}

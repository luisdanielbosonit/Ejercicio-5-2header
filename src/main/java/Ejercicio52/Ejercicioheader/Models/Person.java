package Ejercicio52.Ejercicioheader.Models;


import lombok.Data;

@Data
public class Person {

     String name;
     String city;
     int age;

     public Person(String name, String city, int age) {
          this.name = name;
          this.city = city;
          this.age = age;
     }
     public Person(){
     }

     public Person(String bean1) {
     }
}


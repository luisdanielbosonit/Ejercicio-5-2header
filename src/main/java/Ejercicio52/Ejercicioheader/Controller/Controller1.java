package Ejercicio52.Ejercicioheader.Controller;

import Ejercicio52.Ejercicioheader.Models.City;
import Ejercicio52.Ejercicioheader.Models.Person;
import Ejercicio52.Ejercicioheader.Service.ServiceCityImple;
import Ejercicio52.Ejercicioheader.Service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/controlador1")
public class Controller1 {

    @Autowired
    ServicePerson servicioPerson;

    @Autowired
    ServiceCityImple servicioCiudad;


    private Person person;

    @GetMapping("/addPerson")
    public Person viewperson(@RequestHeader Map<String,String> viewPeople){
        person= servicioPerson.viewperson(viewPeople.get("name")
                ,viewPeople.get("city")
                ,Integer.parseInt(viewPeople.get("age")));
        return person;
    }


    @PostMapping("/addCiudad")
    public City addNewCity(@RequestHeader String ciudad, @RequestHeader int numHabitantes){
        City newCity = new City();
        newCity.setCiudad(ciudad);
        newCity.setNumHabitantes(numHabitantes);
             servicioCiudad.listCities.add(newCity);
        return newCity;
    }

}



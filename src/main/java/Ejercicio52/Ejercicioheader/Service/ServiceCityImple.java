package Ejercicio52.Ejercicioheader.Service;

import Ejercicio52.Ejercicioheader.Models.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceCityImple implements ServiceCity {

    public List<City> listCities = new ArrayList<City>();
    @Override
    public List<City> Viewlist() {
        return this.listCities;
    }
}

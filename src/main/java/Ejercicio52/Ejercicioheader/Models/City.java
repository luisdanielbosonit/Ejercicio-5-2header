package Ejercicio52.Ejercicioheader.Models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class City {
    public String ciudad;
    public int numHabitantes;

}

package org.sofkau.retofinal.util;

import org.sofkau.retofinal.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Esta clase representa los datos a utilizar en la solucion de los ejercicios
 */
public class DataUtil {
    /**
     * Esta funcion obtiene la lista de usuarios que crea internamente
     *
     * @return lista de usuarios
     */
    public static List<User> getUsers() {
        List<User> result = new ArrayList<User>();
        result.add(new User(Boolean.FALSE, "xvega@gmail.com"));
        result.add(new User(Boolean.FALSE, "ignaramal@gmail.com"));
        result.add(new User(Boolean.FALSE, "tattorte@gmail.com"));
        result.add(new User(Boolean.FALSE, "SFDaniefra@gmail.com"));
        result.add(new User(Boolean.FALSE, "felipemaring@hotmail.com"));
        result.add(new User(Boolean.FALSE, "oscarfarf@gmail.com"));
        result.add(new User(Boolean.FALSE, "esteban.ea@gmail.com"));
        result.add(new User(Boolean.FALSE, "luismonroy1@gmail.com"));
        result.add(new User(Boolean.FALSE, "steventflor@gmail.com"));
        result.add(new User(Boolean.FALSE, "pealv@gmail.com"));
        result.add(new User(Boolean.FALSE, "alejandro.y@gmail.com"));
        result.add(new User(Boolean.FALSE, "mateog@hotmail.com"));
        result.add(new User(Boolean.FALSE, "diegofelip@gmail.com"));
        result.add(new User(Boolean.FALSE, "erdi@unal.edu.co"));
        result.add(new User(Boolean.FALSE, "duvanle@gmail.com"));
        result.add(new User(Boolean.FALSE, "juandavidama@gmail.com"));
        result.add(new User(Boolean.FALSE, "miller.gall@gmail.com"));
        result.add(new User(Boolean.FALSE, "juandavidnar@gmail.com"));
        result.add(new User(Boolean.FALSE, "santiago@outlook.es"));
        result.add(new User(Boolean.FALSE, "mmaur@gmail.com"));
        result.add(new User(Boolean.FALSE, "danistc@gmail.com"));
        result.add(new User(Boolean.FALSE, "jheda@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebam@gmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera@hotmail.com"));
        result.add(new User(Boolean.FALSE, "Job.andresval@gmail.com"));
        result.add(new User(Boolean.FALSE, "hernanvelasq@gmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sebas@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama@outlook.edu.co"));
        return result;
    }

    /**
     * Esta funcion obtiene la lista de malas palabras que crea internamente
     *
     * @return lista de malas palabras
     */
    public static List<String> getSwearWord() {
        List<String> list = Arrays.asList("gonorrea", "malparido",
                "puta", "puto", "mierda", "pirobo", "hpta", "marica", "guevonada",
                "maricada", "malparida", "malparidas", "malparidos");
        return list;
    }
}

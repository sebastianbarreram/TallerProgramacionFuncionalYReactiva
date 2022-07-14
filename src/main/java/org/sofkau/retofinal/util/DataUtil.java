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
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sebas@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama96@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama96@outlook.edu.co"));
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

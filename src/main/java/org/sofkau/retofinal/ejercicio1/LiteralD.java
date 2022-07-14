package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;

/**
 * Esta clase es la solución al literal d del ejercicio 1
 */
public class LiteralD {
    /**
     * Esta funcion cuenta cuantos correos hay en el listado de usuarios
     *
     * @param users lista de usuarios
     * @return long con la cantidad de correos que hay en el listado ingresado
     */
    public static Long execute(List<User> users) {
        return users.stream()
                .map(user -> user.getEmail())
                .count();
    }

    public static void main(String[] args) {
        List<User> users = DataUtil.getUsers();
        System.out.println(execute(users));
    }
}

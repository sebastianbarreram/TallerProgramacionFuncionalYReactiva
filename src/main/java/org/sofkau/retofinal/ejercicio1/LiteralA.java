package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase es la solución al literal a del ejercicio 1
 */
public class LiteralA {
    /**
     * Esta funcion elimina los correos repetidos del listado ingresado
     *
     * @param users lista de usuarios
     * @return lista de correos de tipo string unicos en el listado ingresado
     */
    public static List<String> execute(List<User> users) {
        return users.stream()
                .map(user -> user.getEmail())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<User> users = DataUtil.getUsers();
        System.out.println(execute(users));
    }
}

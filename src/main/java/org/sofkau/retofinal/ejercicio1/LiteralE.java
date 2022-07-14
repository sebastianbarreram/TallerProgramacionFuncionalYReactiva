package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;

/**
 * Esta clase es la solución al literal e del ejercicio 1
 */
public class LiteralE {
    /**
     * Esta funcion cuenta cuantos correos hay en el listado de usuarios
     * con dominio gmail, hotmail y outlook, y los almacena en listas separadas
     *
     * @param users lista de usuarios
     * @return listado con la cantidad de correos con dominio gmail, hotmail y outlook
     */
    public static List<Long> execute(List<User> users) {
        long usersGmail = users.stream()
                .filter(user -> user.getEmail().contains("@gmail"))
                .count();
        long usersHotmail = users.stream()
                .filter(user -> user.getEmail().contains("@hotmail"))
                .count();
        long usersOutlook = users.stream()
                .filter(user -> user.getEmail().contains("@outlook"))
                .count();
        return List.of(usersGmail, usersHotmail, usersOutlook);
    }

    public static void main(String[] args) {
        List<User> users = DataUtil.getUsers();
        System.out.println(LiteralE.execute(users));
    }
}

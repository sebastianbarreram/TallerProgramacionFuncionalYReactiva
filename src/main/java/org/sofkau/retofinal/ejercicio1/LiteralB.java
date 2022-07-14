package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase es la solución al literal b del ejercicio 1
 */
public class LiteralB {
    /**
     * Esta funcion busca si hay correos con dominio gmail, hotmail y outlook,
     * y los almacena en listas separadas
     *
     * @param users lista de usuarios
     * @return listado con correos gmail, hotmail y outlook separados en listas independientes
     */
    public static List<List<String>> execute(List<User> users) {
        List<String> usersGmail = users.stream()
                .filter(user -> user.getEmail().contains("@gmail"))
                .map(userFilter -> userFilter.getEmail())
                .collect(Collectors.toList());
        List<String> usersHotmail = users.stream()
                .filter(user -> user.getEmail().contains("@hotmail"))
                .map(userFilter -> userFilter.getEmail())
                .collect(Collectors.toList());
        List<String> usersOutlook = users.stream()
                .filter(user -> user.getEmail().contains("@outlook"))
                .map(userFilter -> userFilter.getEmail())
                .collect(Collectors.toList());
        return List.of(usersGmail, usersHotmail, usersOutlook);
    }

    public static void main(String[] args) {
        List<User> users = DataUtil.getUsers();
        LiteralB.execute(users).forEach(list -> System.out.println(list));
    }
}

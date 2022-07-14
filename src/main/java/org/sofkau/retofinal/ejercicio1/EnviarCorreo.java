package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase es la solución al último problema planteado en el ejercicio 1
 */
public class EnviarCorreo {
    /**
     * Esta funcion cambia el estado en el listado de usuarios si se le envio
     * correo a un usuario determinado
     *
     * @param users lista de usuarios
     * @param email correo del usuario al que se le envio correo
     * @return listado de usuarios con el estado modificado del usuario determinado
     */
    public static List<User> execute(List<User> users, String email) {
        List<User> newUsers = users.stream()
                .map(user -> {
                    return user.getEmail().equals(email) ?
                            new User(Boolean.TRUE, user.getEmail()) :
                            new User(user.getEmailState(), user.getEmail());
                })
                .collect(Collectors.toList());
        return newUsers;
    }

    public static void main(String[] args) {
        List<User> newUsers = EnviarCorreo.execute(DataUtil.getUsers(), "sebas@gmail.com");
        newUsers.forEach(user -> System.out.println(
                user.getEmail() + " " + user.getEmailState()));
        System.out.println("-------------------------------------------");
        List<User> newUsers2 = EnviarCorreo.execute(newUsers, "sebama96@gmail.com");
        newUsers2.forEach(user -> System.out.println(
                user.getEmail() + " " + user.getEmailState()));
    }
}

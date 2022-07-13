package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EnviarCorreo {
    public static List<User> execute(String email) {
        List<User> users = DataUtil.getUsers();
        List<User> newUsers = users.stream()
                .map(user -> {
                    return user.getEmail().equals(email) ?
                            new User(Boolean.TRUE,user.getEmail()) :
                            new User(user.getEmailState(),user.getEmail());
                })
                .collect(Collectors.toList());
        return newUsers;
    }

    public static void main(String[] args) {
        EnviarCorreo.execute("sebas@gmail.com")
                .forEach(user -> System.out.println(
                        user.getEmail() + " " + user.getEmailState()));
    }
}

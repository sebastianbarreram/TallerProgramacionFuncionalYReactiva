package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EnviarCorreo {
    public static List<User> execute(List<User> users,String email) {
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
        List<User> newUsers = EnviarCorreo.execute(DataUtil.getUsers(),"sebas@gmail.com");
        newUsers.forEach(user -> System.out.println(
                        user.getEmail() + " " + user.getEmailState()));
        System.out.println("-------------------------------------------");
        List<User> newUsers2 = EnviarCorreo.execute(newUsers,"sebama96@gmail.com");
        newUsers2.forEach(user -> System.out.println(
                        user.getEmail() + " " + user.getEmailState()));
    }
}

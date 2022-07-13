package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class LiteralA {
    public static List<String> execute() {
        List<User> users = DataUtil.getUsers();
        return users.stream()
                .map(user -> user.getEmail())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(execute());
    }
}

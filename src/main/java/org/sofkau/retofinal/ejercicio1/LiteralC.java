package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiteralC {
    public static Boolean execute() {
        List<User> users = DataUtil.getUsers();
        Boolean userEmailsOk = users.stream()
                .map(user -> user.getEmail())
                .map(string -> string.contains("@hotmail.com") ||
                        string.contains("@gmail.com") ||
                        string.contains("@outlook.com"))
                .reduce((bool1, bool2) -> bool1 & bool2)
                .get();
        return userEmailsOk;
    }

    public static void main(String[] args) {
        System.out.println(LiteralC.execute());
    }
}
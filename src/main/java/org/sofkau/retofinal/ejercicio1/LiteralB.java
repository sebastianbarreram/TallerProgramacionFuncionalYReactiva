package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;
import java.util.List;
import java.util.stream.Collectors;

public class LiteralB {
    public static List<List<String>> execute() {
        List<User> users = DataUtil.getUsers();
        List<String> usersGmail = users.stream()
                .filter(user -> user.getEmail().contains("@gmail"))
                .map(userFilter->userFilter.getEmail())
                .collect(Collectors.toList());
        List<String> usersHotmail = users.stream()
                .filter(user -> user.getEmail().contains("@hotmail"))
                .map(userFilter->userFilter.getEmail())
                .collect(Collectors.toList());
        List<String> usersOutlook = users.stream()
                .filter(user -> user.getEmail().contains("@outlook"))
                .map(userFilter->userFilter.getEmail())
                .collect(Collectors.toList());
        return List.of(usersGmail,usersHotmail,usersOutlook);
    }

    public static void main(String[] args) {
        LiteralB.execute().forEach(list->System.out.println(list));
    }
}

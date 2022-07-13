package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;
import java.util.List;

public class LiteralD {
    public static Long execute() {
        List<User> users = DataUtil.getUsers();
        return users.stream()
                .map(user -> user.getEmail())
                .count();
    }

    public static void main(String[] args) {
        System.out.println(execute());
    }
}

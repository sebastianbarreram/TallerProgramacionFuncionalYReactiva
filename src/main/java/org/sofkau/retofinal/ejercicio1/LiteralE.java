package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;
import java.util.List;

public class LiteralE {
    public static List<Long> execute() {
        List<User> users = DataUtil.getUsers();
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
        System.out.println(LiteralE.execute());
    }
}

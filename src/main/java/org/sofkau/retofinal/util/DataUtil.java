package org.sofkau.retofinal.util;

import org.sofkau.retofinal.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<User> getUsers() {
        List<User> result = new ArrayList<User>();
        result.add(new User("Sebastian", "sbarrera.96@hotmail.com"));
        result.add(new User("Sebastian", "sbarrera.96@hotmail.com"));
        result.add(new User("Sebastian", "sbarrera.96@hotmail.com"));
        result.add(new User("Sebastian", "sbarrera.96@hotmail.com"));
        result.add(new User("Sebastian", "sebama96@gmail.com"));
        result.add(new User("Sebastian", "sebama96@outlook.com"));
        return result;
    }
}

package org.sofkau.retofinal.util;

import org.sofkau.retofinal.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataUtil {
    public static List<User> getUsers() {
        List<User> result = new ArrayList<User>();
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sbarrera.96@hotmail.com"));
        result.add(new User(Boolean.FALSE, "sebas@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama96@gmail.com"));
        result.add(new User(Boolean.FALSE, "sebama96@outlook.edu.co"));
        return result;
    }

    public static List<String> getSwearWord(){
        List<String> list = Arrays.asList("gonorrea", "malparido",
                "puta","puto","mierda","pirobo","hijo de puta","hpta","marica","guevonada",
                "maricada");
//        return Flux.fromIterable(list);
        return list;
    }
}

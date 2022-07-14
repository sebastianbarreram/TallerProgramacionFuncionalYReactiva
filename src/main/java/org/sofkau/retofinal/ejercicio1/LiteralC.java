package org.sofkau.retofinal.ejercicio1;

import org.sofkau.retofinal.model.User;
import org.sofkau.retofinal.util.DataUtil;

import java.util.List;

/**
 * Esta clase es la solución al literal c del ejercicio 1
 */
public class LiteralC {
    /**
     * Esta funcion verifica que todos los correos cuantan con un @ y el dominio,
     * y por esto son validos
     *
     * @param users lista de usuarios
     * @return boolean true si todos los correos son validos, de lo contrario retorna boolean false
     */
    public static Boolean execute(List<User> users) {
        Boolean userEmailsOk = users.stream()
                .map(user -> user.getEmail())
                .map(string -> string.matches("^[a-zA-Z0-9_!#$%&'*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,4}"))
                .reduce((bool1, bool2) -> bool1 & bool2)
                .get();
        return userEmailsOk;
    }

    public static void main(String[] args) {
        List<User> users = DataUtil.getUsers();
        System.out.println(LiteralC.execute(users));
    }
}
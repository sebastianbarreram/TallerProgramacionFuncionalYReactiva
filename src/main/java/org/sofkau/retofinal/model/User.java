package org.sofkau.retofinal.model;

/**
 * Esta clase tiene los atributos y metodos de un usuario
 */
public class User {
    private Boolean emailState;
    private String email;

    /**
     * Esta funcion crea un usuario con el estado del correo y el correo
     *
     * @param emailState estado del correo si fue enviado o no a ese usuario
     * @param email      correo del usuario
     */
    public User(Boolean emailState, String email) {
        this.emailState = emailState;
        this.email = email;
    }

    /**
     * Esta funcion obtiene el valor del atributo estado del correo
     *
     * @return valor del atributo estado del correo
     */
    public Boolean getEmailState() {
        return emailState;
    }

    /**
     * Esta funcion obtiene el valor del atributo correo
     *
     * @return valor del atributo correo
     */
    public String getEmail() {
        return email;
    }

    /**
     * Esta funcion establece el valor del atributo estado del correo
     *
     * @param emailState valor que se le desea asignar al estado del correo
     */
    public void setEmailState(Boolean emailState) {
        this.emailState = emailState;
    }

    /**
     * Esta funcion establece el valor del atributo correo
     *
     * @param email valor que se le desea asignar al correo
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

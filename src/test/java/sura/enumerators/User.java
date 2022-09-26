package sura.enumerators;

public enum User {

    STANDARD_USER ("standard_user", "secret_sauce", " a standard user"),
    PROBLEM_USER ("problem_user", "secret_sauce", "a user with problems"),
    GLITCH_USER ("performance_glitch_user", "secret_sauce", "a glitched user"),

    LOCKED_USER ("locked_out_user", "secret_sauce", " a locked out user"),

    INEXISTENT("gandalf", "the_sourcere", "inexistent user"),

    ONLY_WITH_USERNAME ("gandalf", "", "keying just the username"),

    ONLY_WITH_PASSWORD ("", "acacacac", "keying just the password"),

    WITH_ALL_FIELDS_EMPTY ("", "", "leaving all fields in blank");


    private final String usuario;
    private final String clave;
    private final String descripcion;
    User (String usuario, String clave, String descripcion){
        this.usuario = usuario;
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public String getUsuario() { return usuario; }

    public String getClave() { return clave; }

    public String getDescripcion() { return descripcion; }
}

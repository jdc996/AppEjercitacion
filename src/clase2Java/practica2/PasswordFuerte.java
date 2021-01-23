package clase2Java.practica2;

public class PasswordFuerte extends Password {
    private static final String PASSWORD_FUERTE="^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";

    public PasswordFuerte() {
        super(PASSWORD_FUERTE);
    }
}


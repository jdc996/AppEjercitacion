package clase2Java.practica2;

public class PasswordIntermedia extends Password{

    private static final String PASSWORD_INTERMEDIA = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";

    public PasswordIntermedia() {
        super(PASSWORD_INTERMEDIA);
    }
}

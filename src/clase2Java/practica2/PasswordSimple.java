package clase2Java.practica2;

public class PasswordSimple extends Password{

    private static final String PASSWORD_SIMPLE = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";

    public PasswordSimple() {
        super(PASSWORD_SIMPLE);
    }


}

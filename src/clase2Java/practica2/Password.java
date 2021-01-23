package clase2Java.practica2;

import javax.xml.bind.ValidationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Password {
    private String regex;
    private String password;

    public  void setValue(String pwd) throws ValidationException {

        Pattern pat = Pattern.compile(this.regex);
        Matcher mat = pat.matcher(pwd);
        if(!mat.matches()) {
            throw new ValidationException("contraseña no valida");
        }
        System.out.println("Contraseña Valida");

    };
    public Password(String regex) {
        this.regex = regex;
    }
}

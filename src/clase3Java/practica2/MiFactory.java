package clase3Java.practica2;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objNeme) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties pro = new Properties();
        pro.load(new FileReader("src/clase3Java/practica2/MiFactory.properties"));
        String obj = pro.getProperty(objNeme);
        return Class.forName(obj).newInstance();

    }



}

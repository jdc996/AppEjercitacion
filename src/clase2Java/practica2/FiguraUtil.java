package clase2Java.practica2;

import java.util.ArrayList;

public class FiguraUtil {

    public static double areaPromedio (ArrayList<FiguraGeometrica> lista){
        double areaPromedio = 0;
        for (FiguraGeometrica fig:lista) {
            areaPromedio = areaPromedio + fig.area();
        }
        return areaPromedio/lista.size();
    }

    public static void toString(ArrayList<FiguraGeometrica> lista){
        for(FiguraGeometrica fig:lista){
            System.out.println(fig +" ,");
        }
    }
}

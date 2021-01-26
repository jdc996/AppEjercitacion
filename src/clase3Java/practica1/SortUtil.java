package clase3Java.practica1;

public class SortUtil {
    public static <T> void ordenar(Precedable<T> arr[]){
        System.out.println(arr);
        Precedable[] copiaArreglo = arr.clone();
        System.out.println(copiaArreglo);



        for (int i = 0; i < copiaArreglo.length ; i++) {
            for (int j = 0; j < copiaArreglo.length - 1; j++) {

                if(copiaArreglo[j].precedeA(copiaArreglo[j+1])>0){
                    Precedable aux = copiaArreglo[j+1];
                    copiaArreglo[j+1] = copiaArreglo[j];
                    copiaArreglo[j]= aux;
                }
            }
        }



    }
}


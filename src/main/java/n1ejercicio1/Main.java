package n1ejercicio1;

import org.junit.jupiter.api.Assertions;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> meses = new ArrayList<>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        Assertions.assertNotNull(meses);//verificamos si la lista tiene elementos
        Assertions.assertEquals(12,meses.size());//verificamos que la lista tiene una longitud de 12 caracteres
        Assertions.assertEquals(8,meses.indexOf("Agosto"));//verificamos si agosto está en la posicion 8(spoiler : No)

    }
}
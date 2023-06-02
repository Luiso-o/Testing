package n2ejercicio1;

import org.hamcrest.*;
import scala.Int;

// FeatureMatcher <objeto de prueba, valor que estamos evaluando>
public class PruebaLongitudTexto extends FeatureMatcher <String, Integer> {
    //Atributo longitud
    private final int longitudTexto;

    //constructor
    public PruebaLongitudTexto(int longitudTexto) {
        super(Matchers.equalTo(longitudTexto), "Longitud esperada de la cadena", "Longitud real");
        this.longitudTexto = longitudTexto;
    }

    //devolvemos el valor de la logitud de la cadena al ingresar una cadena como parametro
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }
}

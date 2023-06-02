package n2ejercicio1;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyTest {
    @Test
    public void testLongitudCadena() {
        String texto = "Mordor";
        assertThat(texto, new PruebaLongitudTexto(6));//prueba la longitud de la cadena Mordor
    }
}


package n1ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {
    private n1ejercicio2.CalculoDni CalculoDni;

    @ParameterizedTest //metodo de prueba parametrizado
    @CsvSource({ //proporciona datos en formato CSV, de esta manera calcula cada documento uno por uno
            "12345678, Z",
            "98765432, M",
            "87654321, X",
            "65432187, Q",
            "17384755, K",
            "93763847, E",
            "89465342, S",
            "98347836, P",
            "82936162, X",
            "64576676, D"
    })

    //Metodo que captura y Testea
    public void testCalcularLetraDni(int dni, char letra) {
        char calcula = CalculoDni.calcularLetraDni(dni);
        assertEquals(letra, calcula);//Verifica si la letra calculada coincida con la letra esperada
    }

}
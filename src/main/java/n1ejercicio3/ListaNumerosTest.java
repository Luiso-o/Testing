package n1ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListaNumerosTest {

    @Test
    public void testeaArray(){
       ListaNumeros misNumeros = new ListaNumeros();
       //provocamos un ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, misNumeros::accedeANumeros);
    }


}
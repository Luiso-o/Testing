package n3ejercicio2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

//isSameAs() && isNotSameAs()
public class testObjetos {

    @Test
    public void compararObjetos(){
        Object espero = new Object();
        Object actual = espero;

        assertThat(actual).isSameAs(espero);

    }

    @Test
    public void compararObjetos2(){
        Object espero = new Object();
        Object actual = new Object();

        assertThat(actual).isNotSameAs(espero);

    }


}

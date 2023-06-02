package n3ejercicio1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

//isEqualTo() && isNotEqualTo()
public class testEnteros {

    @Test
    public void numerosIguales(){
        int espero = 5;
        int actual = 5;

        assertThat(actual).isEqualTo(espero);

    }

    @Test
    public void numerosDiferentes(){
        int espero = 5;
        int actual = 10;

        assertThat(actual).isNotEqualTo(espero);
    }

}

package n3ejercicio3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

//isEqualTo() && inNotEqualTo()
public class TestCadenas {

    @Test
    public void verificarTexto(){
       String espero = "Una cadena correcta";
       String actual = "Una cadena correcta";

       assertThat(espero).isEqualTo(actual);
    }

    @Test
    public void verificarTexto2(){
        String espero = "Una cadena correcta";
        String actual = "Una cadena incorrecta";

        assertThat(espero).isNotEqualTo(actual);
    }

}

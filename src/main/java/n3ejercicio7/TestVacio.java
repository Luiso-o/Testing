package n3ejercicio7;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//isEmpty()
public class TestVacio {

    String vacio;

    @Test
    public void verificaVacio(){
        vacio = "";
        assertThat(vacio).isEmpty();

    }

}

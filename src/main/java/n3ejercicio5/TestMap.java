package n3ejercicio5;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

//containsKeys()
public class TestMap {

    Map<Integer,String> nombres = new HashMap<>();

    @Test
    public void contenedorMap(){

        nombres.put(1,"Ana");
        nombres.put(2,"José");
        nombres.put(3,"Martha");

        assertThat(nombres).containsKeys(1);//Verificar que el mapa contiene la LLave con el valor 1

    }

}

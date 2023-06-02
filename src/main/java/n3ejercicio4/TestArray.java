package n3ejercicio4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Java6Assertions.assertThat;

//Contains() && containsExactlyInAnyOrder()
//containsOnlyOnce() && doesNotContain ()
public class TestArray {

    ArrayList<Object> contenedor = new ArrayList<>();

    String nombre = "Laura";
    Integer edad = 31;
    Character sexo = 'F';

    @Test
    public void testContenedor(){
        contenedor.add(nombre);
        contenedor.add(edad);
        contenedor.add(sexo);

        //Verificar que el objeto contiene estos elementos en el orden que fueron agregados a la lista
        assertThat(contenedor).contains("Laura",31,'F');

    }

    @Test
    public void testContenedor2(){
        contenedor.add(nombre);
        contenedor.add(edad);
        contenedor.add(sexo);

        //Verificar que el objeto contiene estos elementos en desorden
        assertThat(contenedor).containsExactlyInAnyOrder('F',"Laura",31);

    }

    @Test
    public void testContenedor3(){
        contenedor.add(nombre);
        contenedor.add(edad);
        //no añado el objeto sexo

        assertThat(contenedor).contains("Laura").contains(31)//Verificar que contiene los objetos nombre y edad
                .containsOnlyOnce("Laura")//Verificar que contiene Laura solo una vez
                .doesNotContain('F');//Verificar que no contiene el Objeto Character sexo
    }

}

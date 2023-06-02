package n3ejercicio6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

//assertNotNull() && fail
public class TestLongitud {

    ArrayList <Persona> listaPersona = new ArrayList<>();
    Persona presentacion1 = new Persona();
    Persona presentacion2 = new Persona();
    Persona presentacion3 = new Persona();

    @Test
    public void longitudPersona(){

       listaPersona.add(presentacion1);
       listaPersona.add(presentacion2);
       listaPersona.add(presentacion3);

    try{
        listaPersona.get(3);//provoco una excepion fuera del indice de la lista

        //si no se provoca la excepcion escribimos este mensaje con el metodo fail
        fail("Se esperaba ArrayIndexOutOfBoundsException pero no se lanzó ninguna excepción.");

    }catch (ArrayIndexOutOfBoundsException e){
        assertNotNull(e);//verifica la excepcion

    }

    }

}

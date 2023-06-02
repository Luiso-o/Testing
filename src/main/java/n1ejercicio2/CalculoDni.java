package n1ejercicio2;

public class CalculoDni {

    public static char calcularLetraDni(int dni) {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int indice = dni % 23;
            return letras.charAt(indice);
        }

    }




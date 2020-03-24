import Personas.Persona;

import java.util.Arrays;

/**
 * Clase principal donde se da de alta un Arreglo con 4 elementos de tipo Persona, uno de ellos tiene el mismo nombre
 * pero tiene dirección diferente. Notese que estamos usando el método sort de Arrays para ordenar un arreglo (para
 * esto es necesario que la interfaz Comparable este implementada en el TDA).
 */
public class principal {
    public static void main(String[] args) {
        Persona personas[] = new Persona[4];

        personas[0] = new Persona("Juan", "Comontfort", "4731234567");
        personas[1] = new Persona("Ana Maria", "Privada Allende 30", "3312345678");
        personas[2] = new Persona("Benjamin", "Quinta Correjidora 20", "4771234567");
        personas[3] = new Persona("Juan", "Callejon de Beso 10", "4621234567");

        for (Persona elemento: personas){
            System.out.println(elemento);
        }

        System.out.println("-----------------------------------------------------");
        Arrays.sort(personas);
        for (Persona elemento: personas){
            System.out.println(elemento);
        }
    }
}

import Personas.Persona;
import com.sun.security.jgss.GSSUtil;

public class principal_shallowcopy {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "Quinta Allende 15", "4731234567");

        System.out.println(persona1);
        // Estamos copiando la referencia del objeto
        Persona persona2 = persona1;
        persona2.setNombre("Mariana Sanchez");

        System.out.println(persona2);

        System.out.println("------------------");
        System.out.println(persona1);
        System.out.println(persona2);
    }
}

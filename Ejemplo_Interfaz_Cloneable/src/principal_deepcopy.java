import Personas.Persona;

public class principal_deepcopy {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "Quinta Allende 15", "4731234567");

        System.out.println(persona1);

        // Copia a Profundidad
        Persona persona2 = persona1.clone();
        persona2.setNombre("Mariana Sanchez");

        System.out.println(persona2);

        System.out.println("------------------");
        System.out.println(persona1);
        System.out.println(persona2);
    }
}

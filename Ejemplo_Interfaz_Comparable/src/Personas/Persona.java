package Personas;

/**
 * Clase Person que implementa la Interfaz Comparable, el primer criterio para establecer la jerarquia entre clases
 * es el nombre, si hay dos clases con nombres iguales nos pasamos al criterio de la dirección.
 */
public class Persona implements Comparable<Persona>{
    private String Nombre;
    private String Direccion;
    private String Telefono;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona persona) {
        if (this.Nombre.equals(persona.Nombre)){
            return this.Direccion.compareTo(persona.Direccion);
        }
        return this.Nombre.compareTo(persona.Nombre);
    }
}

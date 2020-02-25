package Productos;

public class Video extends Almacenamiento{
    private String Genero;
    private String Actores;

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getActores() {
        return Actores;
    }

    public void setActores(String actores) {
        Actores = actores;
    }
}

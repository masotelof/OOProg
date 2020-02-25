import Productos.Musica;
import Productos.Producto;
import Productos.Reproduccion;
import Productos.Video;

public class principal {
    public static void main(String[] args) {
        Producto productos[] = new Producto[3];
        productos[0] = new Musica();
        productos[1] = new Video();
        productos[2] = new Reproduccion();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] instanceof Musica) {
                // ((Musica) productos[i])
            } else if (productos[i] instanceof Video){
                // ((Video) productos[i]).
            } else {
                //((Reproduccion) productos[i]).
            }
        }
    }
}
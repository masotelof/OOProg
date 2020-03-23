import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Cubo;
import Figuras.Figura;

public class principal {
    public static void main(String[] args) {
        Figura figuras[] = new Figura[3];
        figuras[0] = new Figura(){

            @Override
            public void CalcularArea() {

            }

            @Override
            public void CalcularPerimetro() {

            }

            public String toString(){
                return "Esta es una clase Virtual";
            }
        };
        figuras[1] = new Circulo(2f);
        figuras[2] = new Cuadrado(2f);

        for(Figura elemento: figuras){
            elemento.CalcularArea();
            elemento.CalcularPerimetro();
            System.out.println(elemento);
        }

        Cubo cubo = new Cubo(2f);
        cubo.CalcularArea();
        cubo.CalcularPerimetro();
        cubo.CalcularVolumen();
        System.out.println(cubo);
    }
}

package Figuras;

public class Cubo extends Cuadrado  implements Figura3D{
    private Float Volumen;
    public Cubo(Float lado) {
        super(lado);
    }

    @Override
    public void CalcularArea() {
        this.Area = (this.Lado * this.Lado) * 6;
    }

    @Override
    public void CalcularVolumen() {
        this.Volumen =  this.Lado * this.Lado * this.Lado;
    }

    @Override
    public void CalcularPerimetro() {
        this.Perimetro = 12 * this.Lado;
    }

    public String toString(){
        return super.toString() + "\nVolumen: " + this.Volumen;
    }
}

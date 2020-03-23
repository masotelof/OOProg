package Figuras;

public class Cuadrado extends Figura{
    protected Float Lado;

    public Cuadrado(Float lado) {
        Lado = lado;
    }

    public void CalcularArea(){
        this.Area = this.Lado * this.Lado;
    }

    public void CalcularPerimetro(){
        this.Perimetro = 4 * this.Lado;
    }
    public String toString(){
        return "Cuadrado\n" + super.toString();
    }
}

package Figuras;

public class Circulo extends Figura {
    public Float Radio;

    public Circulo(Float radio) {
        Radio = radio;
    }

    public void CalcularArea(){
        this.Area = (float) Math.PI * this.Radio*this.Radio;
    }

    public void CalcularPerimetro(){
        this.Perimetro = (float) Math.PI * 2 * this.Radio;
    }
    public String toString(){
        return "Circulo\n" + super.toString();
    }
}

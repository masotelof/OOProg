package Figuras;

public abstract class Figura {
    protected Float Area;
    protected Float Perimetro;

    public Float getArea() {
        return Area;
    }
    public Float getPerimetro() {
        return Perimetro;
    }

    public abstract void CalcularArea();
    public abstract void CalcularPerimetro();

    public String toString(){
        return String.format("Area: %.2f\nPerimetro: %.2f", this.Area, this.Perimetro);
    }
}

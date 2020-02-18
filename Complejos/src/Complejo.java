public class Complejo {
    private Double Real;
    private Double Img;

    public Double getReal() {
        return Real;
    }
    public void setReal(Double real) {
        Real = real;
    }
    public Double getImg() {
        return Img;
    }
    public void setImg(Double img) {
        Img = img;
    }

    public Complejo(Double Real){
        this.Real = Real;
        this.Img = 0.0;
    }

    public Complejo(Double Real, Double Img){
        this.Real = Real;
        this.Img = Img;
    }

    public Complejo Sumar(Complejo Num){
        return new Complejo(this.Real+Num.Real, this.Img+Num.Img);
    }
    public Complejo Sumar(Double Valor){
        return new Complejo(this.Real+Valor, this.Img);
    }

    public String getString() {
        if (this.Img==0){
            return String.format("%.2f", this.Real);
        }
        return String.format("%.2f + %.2f i", this.Real, this.Img );
    }
}

public class principal {
    public static void main(String[] args) {
        Complejo var1 = new Complejo(4.5);
        Complejo var2 = new Complejo(1.5, 9.0);

        Complejo Suma = var1.Sumar(var2);
        System.out.println(Suma.getString());

        Complejo SumaV = var1.Sumar(var2).Sumar(new Complejo(1.0));
        System.out.println(SumaV.getString());

        Complejo SumaD = var1.Sumar(10.5);
        System.out.println(SumaD.getString());


    }
}

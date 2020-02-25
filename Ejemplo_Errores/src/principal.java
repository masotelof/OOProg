import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        try {
            int a = leer.nextInt();
            int b = leer.nextInt();
            int c = a / b;
            System.out.println(c);
        }catch (InputMismatchException err){
            System.out.println("Los valores que se introdujeron no son enteros");
        }catch (ArithmeticException err){
            System.out.println("Error, el denominador no pude ser 0");
        }catch (Exception err){
            System.out.println(err);
        }

        System.out.println("Si llega aquí");
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            int num1, num2;
            System.out.println("Introduzca el número 1: ");
            num1 = leer.nextInt();
            System.out.println("Introduzca el número 2: ");
            num2 = leer.nextInt();
            int div = num1 / num2;

            System.out.printf("El Resultado de esta operación es %d", div);
        } catch (InputMismatchException ex){
            System.out.println("Ocurrio un Error, se introdujo un valor que no es númerico");
        } catch (ArithmeticException ex){
            System.out.println("Ocurrio un error aritmetico");
            System.out.println(ex);
        } catch (Exception ex){
            System.out.println("Ocurrio un error");
            System.out.println(ex);
        }
        System.out.println("Se termino el programa");
    }
}

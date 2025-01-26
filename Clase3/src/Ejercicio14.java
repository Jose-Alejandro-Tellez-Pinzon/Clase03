import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;
        while (numero >= 0 ) {
            

            System.out.println("Ingrese un numero entero positivo");
            numero = scanner.nextInt();

            resultado = numero * numero * numero;

            System.out.println("El cubo de " + numero + " es: " + resultado);
            
        }
        System.out.println("El numero ingresado no es positivo");

    
       scanner.close();
    }
}
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu programa para saber si tu numero es divisible por 2 o por 7");

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingresa tu numero: ");
        var valor = numero.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Tu numero es divisible por dos");

        } else if (valor % 7 == 0) {
            System.out.println("Tu numero es divisible por siete");

        } else {
            System.out.println("No es divisible por ninguno de los dos numeros");

        }

        numero.close();
    }
}

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a tu programa para saber si tu numero es par o impar");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el numero: ");
        var numero = entrada.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + resultado);

        entrada.close();
    }
}

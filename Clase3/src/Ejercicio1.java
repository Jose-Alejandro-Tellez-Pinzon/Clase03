import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenido al programa que te ayuda a identificar los numeros");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el numero: ");
        var valor = entrada.nextInt();

        if (valor == 0) {
            System.out.println("Tu numero es cero");

        } else if (valor >= 1) {
            System.out.println("Tu numero es entero positivo");

        } else {
            System.out.println("Tu numero es un entero negativo");
        }

        entrada.close();
    }
}

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a su programa para identificar letras");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la letra:");
        char letra = entrada.nextLine().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("Mayúscula");

        } else {
            System.out.println("Minúscula");
            
        }
        
        entrada.close();
    }
}

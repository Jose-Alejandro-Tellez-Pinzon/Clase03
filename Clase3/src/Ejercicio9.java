import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido a tu programa para saber el precio de las camisetas");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el numero de camisetas que compraste: ");
        var camisetas = entrada.nextInt();

        if (camisetas >= 1 && camisetas <= 50 ) {
            System.out.println("El precio por unidad es de $50.000");
            
        } else if (camisetas >= 51 && camisetas <= 100) {
            System.out.println("El precio de las camisetas es de $45.000");
            
        } else if (camisetas >= 101 && camisetas <= 150) {
            System.out.println("El precio de las camisetas es de $40.000");
            
        }else if (camisetas >= 151 && camisetas <= 200) {
            System.out.println("El precio de las camisetas es de $35.000");
            
        }else{
            System.out.println("El precio de las camisetas es de $25.000");
            
        }

        entrada.close();
    }
    
}

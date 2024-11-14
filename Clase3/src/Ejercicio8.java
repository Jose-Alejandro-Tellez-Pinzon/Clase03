import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        System.out.println("Bienvenido al programa para saber en que etapa de tu vida estas :)");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        var edad = entrada.nextInt();

        if (edad >= 0 && edad <= 5 ) {
            System.out.println("Estas en: Primera infancia");
            
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Estas en: Infancia");
            
        }else if (edad >= 12 && edad <= 18) {
            System.out.println("Estas en: Adolecencia");
            
        }else if (edad >= 19 && edad <= 26) {
            System.out.println("Estas en: Juventud");
            
        }else if (edad >= 27 && edad <= 59) {
            System.out.println("Estas en: Adultez");
            
        }else if (edad > 59) {
            System.out.println("Estas en: Persona mayor");
  
        }

        entrada.close();
    }
}

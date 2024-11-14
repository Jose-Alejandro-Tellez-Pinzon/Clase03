import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a tu programa para identificar la letra");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la letra: ");
        char letra = entrada.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O' || letra == 'U') { 
                    
                    System.out.println("Tu letra es vocal");

        } else {
            System.out.println("Tu letra es consonante");
            
        }
        entrada.close();

    }

}

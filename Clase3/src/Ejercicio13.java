import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a tu programa para saber que hermano llega tarde ");
            //Declaramos una variable para la suma total de los números de los hermanosfinal 
            int SUMA_TOTAL = 6; 
            // 1 + 2 + 3
            // Creamos un objeto Scanner para leer los números ingresados por el usuario
            Scanner scanner = new Scanner(System.in);
            // Pedimos al usuario los números de los hermanos que llegaron a tiempo        
            System.out.print("Ingrese el número del primer hermano que llegó a tiempo (1, 2 o 3):");         
            int hermano1 = scanner.nextInt();        
            System.out.print("Ingrese el número del segundo hermano que llegó a tiempo (1, 2 o 3):");         
            int hermano2 = scanner.nextInt();
            // Verificamos que los números ingresados sean válidos
            if (hermano1 < 1 || hermano1 > 3 || hermano2 < 1 || hermano2 > 3 || hermano1 == hermano2) {            
                System.out.println("Los números ingresados no son válidos. Intente de nuevo.");        
            } else {             
                // Calculamos el número del hermano que llegó tarde
                int hermanoTarde = SUMA_TOTAL - (hermano1 + hermano2);
                // Mostramos el resultado            
                System.out.println("El hermano que llegó tarde es el número: " + hermanoTarde); }
                // Cerramos el Scanner 
                scanner.close();
             } 
            
            }
    

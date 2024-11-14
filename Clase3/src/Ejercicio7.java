import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Bienvenido a tu programa para armar triangulos");
       
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Ingresa el primer valor: ");
        var valor1 = entrada.nextInt();
       
        System.out.print("Ingresa el segundo valor: ");
        var valor2 = entrada.nextInt();
       
        System.out.print("Ingresa el tercer valor: ");
        var valor3 = entrada.nextInt();
        

        if ((valor1 + valor2 > valor3) && (valor1 + valor3 > valor2) && (valor2 + valor3 > valor1)) {

            System.out.println("Los valores permiten formar un triangulo");
        } else {
            System.out.println("Los valores ingresados no permiten formar un triangulo");

        }
        entrada.close();

    }

}

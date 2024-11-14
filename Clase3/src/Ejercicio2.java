import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al seleccionador de numeros mayores");
        
        Scanner valor = new Scanner(System.in);
       
        System.out.print("ingresa el primer numero ");
        var valor1 = valor.nextInt();
        
        System.out.print("ingresa el segundo numero ");
        var valor2 = valor.nextInt();
        
        System.out.print("ingresa el tercer numero ");
        var valor3 = valor.nextInt();

        if (valor1 > valor2) {
            System.out.println("Valor uno mayor");

        } else if (valor2 > valor1) {
            System.out.println("Valor dos mayor");

        } else if (valor3 > valor1) {
            System.out.println("Valor tres mayor");

        } else {
            System.out.println("Todos son iguales ");
        }

        valor.close();
    }

}

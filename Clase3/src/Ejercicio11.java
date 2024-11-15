import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a tu programa que organiza los numeros de menor a mayor");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer numero:");
        var valor1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero:");
        var valor2 = entrada.nextInt();

        System.out.print("Ingresa el tercero numero:");
        var valor3 = entrada.nextInt();

        int menor, medio, mayor;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                medio = valor2;
                mayor = valor3;
            } else {
                medio = valor3;
                mayor = valor2;
            }

        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                medio = valor1;
                mayor = valor3;
            } else {
                medio = valor3;
                mayor = valor1;
            }

        } else {
            menor = valor3;

            if (valor1 <= valor2) {
                medio = valor1;
                mayor = valor2;
            } else {
                medio = valor2;
                mayor = valor1;
            }

            entrada.close();
        }
        System.out.println("El orden de los numeros es asi: " + menor + " " + medio + " " + mayor);
    }
}

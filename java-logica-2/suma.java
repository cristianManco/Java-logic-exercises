import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// imprimir la suma de los 100 primeros numeros naturales


public class suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = scanner.nextInt();

        int sumTotal = 0;   
        int sumPares = 0;     
        int sumImpares = 0;  

        // Listas para almacenar números pares e impares
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 1; i <= num; i++) { // Cambiado a i=1 para evitar el 0
            // System.out.println("Número: " + i);
            sumTotal += i;

            if (i % 2 == 0) {
                // System.out.println(i + " es par");
                pares.add(i);
                sumPares += i;
            } else {
                // System.out.println(i + " es impar");
                impares.add(i);
                sumImpares += i;
            }
        }

        System.out.println("La suma total de todos los números es: " + sumTotal);
        System.out.println("La suma de los números pares es: " + sumPares);
        System.out.println("La suma de los números impares es: " + sumImpares);

        System.out.print("Numeros pares: ");
        for (int p : pares) {
            System.out.print(p + ", ");
        }
        System.out.println();

        System.out.print("Numeros impares: ");
        for (int i : impares) {
            System.out.print(i + ", ");
        }
        System.out.println();

        scanner.close();
    }
}


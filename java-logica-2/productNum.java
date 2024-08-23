
import java.util.Scanner;

// leer un numero e imprimir el producto del numero leido por los factores del 1 - 15
public class productNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        int product = 1;
        int num2 = 0;

        for (int i = 1; i <= 15; i++) {
            product *= i;
            num2 = num * i;
            System.out.println(num + " X " + i + " = " + num2);
        }

        System.out.println("El producto de los factores del 1 al 15, del numero " + num + " es: " + product);
        scanner.close();

    }
}

// imprimir las tablas de multiplicar del 1- 12 multiplicado por los factorres del 1 al 12 imprimirlas todas
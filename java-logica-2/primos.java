import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el limite asta donde quiere ver los numeros  primos: ");
        int range = scanner.nextInt();

        // Iterar sobre el rango de 0 asta range ingresado
        for (int num = 2; num <= range; num++) {
            if (esPrimo(num)) {
                System.out.println(num+"  es un numero primo");
            }
        }
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        // Solo necesitamos verificar hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // El número no es primo si es divisible por i
                return false; 
            }
        }
        // El número es primo si no es divisible por ningún número hasta su raíz cuadrada
        return true; 
    }
}

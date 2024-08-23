import java.util.Scanner;

public class procedimientos {

    public static void main(String[] args) {
        char opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            mostrarMenu(); // Mostrar el menú de opciones

            // Validar la opción del usuario
            do {
                System.out.printf("\nIntroduzca opción (1-4): ");
                opcion = scanner.next().charAt(0);
            } while (opcion < '1' || opcion > '4');

            // Ejecutar la opción seleccionada
            System.out.printf("\n");
            switch (opcion) {
                case '1':
                    numerosDelUnoAlDiez();
                    break;
                case '2':
                    tablaDel8();
                    break;
                case '3':
                    potenciasDe2();
                    break;
                case '4':
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (opcion != '4'); // Salir del bucle si la opción es '4'

        scanner.close(); // Cerrar el recurso Scanner
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.printf("\n>>> MENÚ DE OPCIONES <<<");
        System.out.printf("\n1. Números del 1 al 10.");
        System.out.printf("\n2. Tabla de multiplicar del 8.");
        System.out.printf("\n3. Primeras diez potencias de 2.");
        System.out.printf("\n4. Salir.");
    }

    // Método para mostrar números del 1 al 10
    private static void numerosDelUnoAlDiez() {
        System.out.println("Números del 1 al 10:");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.printf("%d ", numero);
        }
        System.out.printf("\n");
    }

    // Método para mostrar la tabla de multiplicar del 8
    private static void tablaDel8() {
        System.out.println("Tabla de multiplicar del 8:");
        for (int contador = 1; contador <= 10; contador++) {
            int resultado = contador * 8;
            System.out.printf("8 * %d = %d\n", contador, resultado);
        }
    }

    // Método para mostrar las primeras diez potencias de 2
    private static void potenciasDe2() {
        System.out.println("Primeras diez potencias de 2:");
        for (int contador = 1; contador <= 10; contador++) {
            int potencia = (int) Math.pow(2, contador);
            System.out.printf("%d ", potencia);
        }
        System.out.printf("\n");
    }
    
}



// 
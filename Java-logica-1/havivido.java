import java.util.Scanner;
// leer el nombre de una persona al igual que su edad imprimir el nombre de la persona y los dias vividos

public class havivido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        int diasVividos = 365 * edad;

        System.out.println("Info: " + nombre + ", Ha vivido: " + diasVividos + " dias");
        scanner.close();
    }
}


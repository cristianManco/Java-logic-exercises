import java.util.Scanner;

// imprimir las tablas de multiplicar del 1- asta el numero que ingrese el usuario multiplicado por los factores del 1 al 12 imprimirlas todas en orden
public class tablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número hasta donde quire ver las tablas de multiplicar: ");
        int num = scanner.nextInt();
        if (num<1) {
            System.out.println("El número debe ser mayor o igual a 1.");
            scanner.close();
        }

        System.out.println("Tablas de multiplicar del 1 al " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.println("\nTabla de multiplicar del " + i + ":");
            for (int c = 1; c <= 12; c++) {
                System.out.println(i + " x " + c + " = " + (i * c));
            }
        }
        scanner.close();
    }
    
}
// para x empleo se requiere que la persona sea mayor de edad de sexo f femenino y con 5 años de experiencia en el cargo.
// se requieren 10 personas 
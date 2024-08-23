import java.util.Scanner;
// para x empleo se requiere que la persona sea mayor de edad de sexo f femenino y con 5 años de experiencia en el cargo.
// se requieren n  personas 

public class empleo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de vacantes (debe ser almenos 1):");
        int vacantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        // Validar el número de vacantes
        if (vacantes < 1) {
            System.out.println("El número de vacantes debe ser al menos 1.");
            scanner.close();
            return;
        }

        int empleadosAceptados = 0;
        int empleadosRechazados = 0;

        while (empleadosAceptados <= vacantes) {
            System.out.println("Ingrese edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            if (edad < 18) {
                System.out.println("Debes ser mayor de edad. Intento fallido.");
                empleadosRechazados++;
                continue;
            }


            System.out.println("Ingrese sexo (F/M):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo != 'F') {
                System.out.println("Debes ser de sexo F (femenino). Intento fallido.");
                empleadosRechazados++;
                continue;
            }


            System.out.println("Ingrese años de experiencia:");
            int añosExperiencia = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            if (añosExperiencia < 5) {
                System.out.println("Debes tener al menos 5 años de experiencia en el cargo. Intento fallido.");
                empleadosRechazados++;
                continue;
            }

            System.out.println("Ingrese nombre:");
            String nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("Nombre no válido. Intento fallido.");
                empleadosRechazados++;
                continue;
            }

            // Si pasa todas las validaciones
            empleadosAceptados++;
            System.out.println("Empleo aceptado para: " + nombre);
        }

        System.out.println("Número de vacantes completado.");
        System.out.println("Total de empleados aceptados: " + empleadosAceptados);
        System.out.println("Total de empleados no aceptados: " + empleadosRechazados);

        scanner.close();
    }
}

import java.util.Scanner;
// 1. Dada la Nota de bases de datos, Estadística e Informática de un grupo de 25 alumnos, realice un algoritmo que permita calcular y dar como salida lo siguiente: 
// Promedio de Informática 
// Cantidad de aprobados en bases de datos, se aprueba con 3 
// Nota mayor de Informática
// Nota menor de Informática y Nombre de la persona que la Obtuvo. 

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //arreglos para almacenar las notas
        double[] notasBD = new double[10];
        double[] notasEst = new double[10];
        double[] notasInf = new double[10];
        String[] nombres = new String[10];

        // Leer nombres y notas
        System.out.println("Ingrese los nombres de los 25 alumnos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.next();
        }

        System.out.println("Ingrese las notas de Bases de Datos de los 25 alumnos:");
        for (int i = 0; i < 10; i++) {
            notasBD[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese las notas de Estadística de los 25 alumnos:");
        for (int i = 0; i < 10; i++) {
            notasEst[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese las notas de Informática de los 25 alumnos:");
        for (int i = 0; i < 10; i++) {
            notasInf[i] = scanner.nextDouble();
        }

        // Calcular y mostrar el promedio de Informática
        double promedioInf = calcularPromedio(notasInf);
        System.out.println("Promedio de Informática: " + promedioInf);

        // Calcular cantidad de aprobados en Bases de Datos
        int aprobadosBD = 0;
        for (double nota : notasBD) {
            if (nota >= 3) {
                aprobadosBD++;
            }
        }
        System.out.println("Cantidad de aprobados en Bases de Datos: " + aprobadosBD);

        // Encontrar la nota mayor y menor de Informática
        double notaMayorInf = notasInf[0];
        double notaMenorInf = notasInf[0];
        String nombreNotaMenorInf = nombres[0];

        for (int i = 0; i < 10; i++) {
            if (notasInf[i] > notaMayorInf) {
                notaMayorInf = notasInf[i];
            }
            if (notasInf[i] < notaMenorInf) {
                notaMenorInf = notasInf[i];
                nombreNotaMenorInf = nombres[i];
            }
        }

        System.out.println("Nota mayor de Informática: " + notaMayorInf);
        System.out.println("Nota menor de Informática: " + notaMenorInf);
        System.out.println("Nombre de la persona que obtuvo la nota menor: " + nombreNotaMenorInf);

        scanner.close();
    }

    // Método para calcular el promedio de un arreglo de notas
    private static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}

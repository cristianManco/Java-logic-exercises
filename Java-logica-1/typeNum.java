import java.util.Scanner;

public class typeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n1 = scanner.nextInt();

        if (n1 < 0) {
            System.out.println("El número: "+n1+"  es negativo.");
        } else if (n1 > 0) {
            System.out.println("El número: "+n1+"  es positivo.");
        }else {
            System.out.println("El número: "+n1+"  es un cero.");
        }


        if (n1 % 2==0) {
            System.out.println("El número: "+n1+"  es par.");
        } else if (n1 % 2 !=0) {
            System.out.println("El número: "+n1+"  es impar.");
        } else {
            System.out.println("El número: "+n1+"  es un cero.");
        }

        scanner.close();
    }
}




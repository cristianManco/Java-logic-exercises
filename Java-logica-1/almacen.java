import java.util.Scanner;

public class almacen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double monto = scanner.nextDouble();
        
        double descuento = 0.0;
        double valorTotal = monto;
        
        // Determinar el descuento basado en el monto de la compra
        if (monto > 300000) {
            // Generar un descuento aleatorio entre 10 y 20
            int randomDescuento = (int) (Math.random() * (20 - 10 + 1)) + 10;
            descuento = monto * (randomDescuento / 100.0);

        } else if (monto > 100000) {
            // Generar un descuento aleatorio entre 5 y 9
            int randomDescuento = (int) (Math.random() * (9 - 5 + 1)) + 5;
            descuento = monto * (randomDescuento / 100.0);

        } else if (monto > 50000) {
            // Generar un descuento aleatorio entre 1 y 4
            int randomDescuento = (int) (Math.random() * (4 - 1 + 1)) + 1;
            descuento = monto * (randomDescuento / 100.0);

        } else {
            // imprimir mensaje de agradecimiento Si el usuario no califica para descuento, 
            System.out.println("Gracias por su compra.");
            scanner.close();
            return;
        }
        
        // Calcular el valor total a pagar después del descuento
        valorTotal = monto - descuento;
        
        // Imprimir los detalles de la compra
        System.out.println("Valor de la compra: " + monto);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Valor total a pagar: " + valorTotal);
        
        scanner.close();
    }
}

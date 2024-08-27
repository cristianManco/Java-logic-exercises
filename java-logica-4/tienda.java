import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Ejercicio Procedimientos

// En una tienda se requiere sistematizar sus ventas:

// - 1. Registro de ventas
// - 2. Consultar las ventas por producto
// - 3. Ventas totales del día.

// Antes de realizar la venta se le solicita al cliente su nombre y apellido.

// Para el registro de ventas, solo se venden los siguientes productos:

// - Pastel $1500
// - Gaseosa $1000
// - Papitas $800
// - Pandequeso $1750
// - Tinto $700
// - Pan $500

// Se solicita la cantidad y se muestra el valor del producto, el cliente puede llevar varios productos

// Mostrar el total a pagar por el cliente.

// Para consultas. Se digita el código del producto y se visualiza:

// el nombre del producto.
// su valor unitario
// cantidad de productos vendidos
// valor vendido

// Para las ventas totales. se muestra el valor vendido de todos los productos.

public class tienda {

    // Definición de productos y precios
    private static final Map<String, Integer> precios = new HashMap<>();
    static {
        precios.put("Pastel", 1500);
        precios.put("Gaseosa", 1000);
        precios.put("Papitas", 800);
        precios.put("Pandequeso", 1750);
        precios.put("Tinto", 700);
        precios.put("Pan", 500);
    }

    // Registro de ventas
    private static final Map<String, Integer> ventas = new HashMap<>();
    private static final Map<String, Integer> cantidadVendida = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            mostrarMenu();
            opcion = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case '1':
                    registrarVenta(scanner);
                    break;
                case '2':
                    consultarVentasPorProducto(scanner);
                    break;
                case '3':
                    mostrarVentasTotales();
                    break;
                case '4':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != '4');

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n>>> MENÚ DE OPCIONES <<<");
        System.out.println("1. Registro de ventas.");
        System.out.println("2. Consultar ventas por producto.");
        System.out.println("3. Ventas totales del día.");
        System.out.println("4. Salir.");
    }

    private static void registrarVenta(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        int totalVenta = 0;

        System.out.println("Productos disponibles:");
        for (String producto : precios.keySet()) {
            System.out.printf("- %s: $%d\n", producto, precios.get(producto));
        }

        while (true) {
            System.out.print("Ingrese nombre del producto (o 'fin' para terminar): ");
            String producto = scanner.nextLine();

            if (producto.equalsIgnoreCase("fin")) {
                break;
            }

            if (!precios.containsKey(producto)) {
                System.out.println("Producto no válido. Inténtelo de nuevo.");
                continue;
            }

            System.out.print("Ingrese cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser positiva. Inténtelo de nuevo.");
                continue;
            }

            int valorUnitario = precios.get(producto);
            int valorTotalProducto = valorUnitario * cantidad;

            ventas.put(producto, ventas.getOrDefault(producto, 0) + valorTotalProducto);
            cantidadVendida.put(producto, cantidadVendida.getOrDefault(producto, 0) + cantidad);

            totalVenta += valorTotalProducto;
            System.out.printf("Valor del producto '%s': $%d\n", producto, valorUnitario);
        }

        System.out.printf("Total a pagar por %s: $%d\n", nombreCliente, totalVenta);
    }

    private static void consultarVentasPorProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto para consultar: ");
        String producto = scanner.nextLine();

        if (!precios.containsKey(producto)) {
            System.out.println("Producto no válido.");
            return;
        }

        int cantidad = cantidadVendida.getOrDefault(producto, 0);
        int valorUnitario = precios.get(producto);
        int valorTotal = ventas.getOrDefault(producto, 0);

        System.out.printf("Producto: %s\n", producto);
        System.out.printf("Valor unitario: $%d\n", valorUnitario);
        System.out.printf("Cantidad vendida: %d\n", cantidad);
        System.out.printf("Valor total vendido: $%d\n", valorTotal);
    }

    private static void mostrarVentasTotales() {
        int totalVentas = 0;

        System.out.println("Ventas totales del día:");
        for (String producto : precios.keySet()) {
            int valorTotal = ventas.getOrDefault(producto, 0);
            if (valorTotal > 0) {
                System.out.printf("Producto: %s\n", producto);
                System.out.printf("Valor total vendido: $%d\n", valorTotal);
                totalVentas += valorTotal;
            }
        }

        System.out.printf("Valor total vendido en el día: $%d\n", totalVentas);
    }
}
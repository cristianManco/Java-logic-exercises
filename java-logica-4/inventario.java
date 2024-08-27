import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class inventario {

    // Definición de productos y precios
    private static final Map<Integer, String> productos = new HashMap<>();
    private static final Map<Integer, Integer> precios = new HashMap<>();
    static {
        productos.put(1, "Pastel");
        productos.put(2, "Gaseosa");
        productos.put(3, "Papitas");
        productos.put(4, "Pandequeso");
        productos.put(5, "Tinto");
        productos.put(6, "Pan");

        precios.put(1, 1500);
        precios.put(2, 1000);
        precios.put(3, 800);
        precios.put(4, 1750);
        precios.put(5, 700);
        precios.put(6, 500);
    }

    // Registro de ventas
    private static final Map<Integer, Integer> ventas = new HashMap<>();
    private static final Map<Integer, Integer> cantidadVendida = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarVenta(scanner);
                    break;
                case 2:
                    consultarVentasPorProducto(scanner);
                    break;
                case 3:
                    mostrarVentasTotales();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

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

        mostrarProductos();

        while (true) {
            System.out.print("Ingrese el número del producto (o 0 para terminar): ");
            int productoId = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (productoId == 0) {
                break;
            }

            if (!productos.containsKey(productoId)) {
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

            int valorUnitario = precios.get(productoId);
            int valorTotalProducto = valorUnitario * cantidad;

            ventas.put(productoId, ventas.getOrDefault(productoId, 0) + valorTotalProducto);
            cantidadVendida.put(productoId, cantidadVendida.getOrDefault(productoId, 0) + cantidad);

            totalVenta += valorTotalProducto;
            System.out.printf("Valor del producto '%s': $%d\n", productos.get(productoId), valorUnitario);
        }

        System.out.printf("Total a pagar por %s: $%d\n", nombreCliente, totalVenta);
    }

    private static void consultarVentasPorProducto(Scanner scanner) {
        System.out.print("Ingrese el número del producto para consultar: ");
        int productoId = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (!productos.containsKey(productoId)) {
            System.out.println("Producto no válido.");
            return;
        }

        int cantidad = cantidadVendida.getOrDefault(productoId, 0);
        int valorUnitario = precios.get(productoId);
        int valorTotal = ventas.getOrDefault(productoId, 0);

        System.out.printf("Producto: %s\n", productos.get(productoId));
        System.out.printf("Valor unitario: $%d\n", valorUnitario);
        System.out.printf("Cantidad vendida: %d\n", cantidad);
        System.out.printf("Valor total vendido: $%d\n", valorTotal);
    }

    private static void mostrarVentasTotales() {
        int totalVentas = 0;

        System.out.println("Ventas totales del día:");
        for (Map.Entry<Integer, String> entry : productos.entrySet()) {
            int productoId = entry.getKey();
            String producto = entry.getValue();
            int valorTotal = ventas.getOrDefault(productoId, 0);
            if (valorTotal > 0) {
                System.out.printf("Producto: %s\n", producto);
                System.out.printf("Valor total vendido: $%d\n", valorTotal);
                totalVentas += valorTotal;
            }
        }

        System.out.printf("Valor total vendido en el día: $%d\n", totalVentas);
    }

    private static void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Map.Entry<Integer, String> entry : productos.entrySet()) {
            int productoId = entry.getKey();
            String producto = entry.getValue();
            int precio = precios.get(productoId);
            System.out.printf("%d. %s: $%d\n", productoId, producto, precio);
        }
    }
}

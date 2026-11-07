import java.util.Scanner;

public class InventarioTienda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] productos = {"Camiseta", "Pantalon", "Zapatos", null, null, null, null, null};
        int[] cantidades = {10, 5, 3, 0, 0, 0, 0, 0};
        int opcion;

        do {
            System.out.println("\n=== Inventario de la tienda ===");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Registrar producto");
            System.out.println("4. Vender unidades");
            System.out.println("5. Mostrar total de unidades");
            System.out.println("6. Terminar");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    mostrarProductos(productos, cantidades);
                    break;
                case 2:
                    System.out.print("Nombre del producto que buscas: ");
                    String nombreBuscado = entrada.nextLine();
                    int posicion = buscarProducto(productos, nombreBuscado);
                    if (posicion == -1) {
                        System.out.println("El producto no existe.");
                    } else {
                        System.out.println(productos[posicion] + ": " + cantidades[posicion] + " unidades.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del producto nuevo: ");
                    String nombreNuevo = entrada.nextLine();
                    System.out.print("Cantidad inicial: ");
                    int cantidadInicial = entrada.nextInt();
                    registrarProducto(productos, cantidades, nombreNuevo, cantidadInicial);
                    break;
                case 4:
                    System.out.print("Nombre del producto que deseas vender: ");
                    String nombreVenta = entrada.nextLine();
                    System.out.print("Cantidad que deseas vender: ");
                    int cantidadVenta = entrada.nextInt();
                    venderProducto(productos, cantidades, nombreVenta, cantidadVenta);
                    break;
                case 5:
                    System.out.println("Unidades totales: " + calcularTotalUnidades(productos, cantidades));
                    break;
                case 6:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        entrada.close();
    }

    // TODO: Recorre los arreglos e imprime cada producto y su cantidad.
    public static void mostrarProductos(String[] productos, int[] cantidades) {
        // Escribe aquí el ciclo para mostrar los productos que no sean null.
    }

    // TODO: Busca el producto sin distinguir mayúsculas y minúsculas.
    // Devuelve su posición o -1 si no lo encuentra.
    public static int buscarProducto(String[] productos, String nombreBuscado) {
        // Escribe aquí el ciclo de búsqueda.
        return -1;
    }

    // TODO: Guarda el producto en la primera posición libre.
    // Revisa que haya espacio y que la cantidad inicial sea válida.
    public static void registrarProducto(String[] productos, int[] cantidades,
                                         String nombre, int cantidad) {
        // Escribe aquí la lógica de registro.
    }

    // TODO: Busca el producto y descuenta las unidades si hay suficiente stock.
    public static void venderProducto(String[] productos, int[] cantidades,
                                      String nombre, int cantidad) {
        // Escribe aquí la lógica de venta.
    }

    // TODO: Suma y devuelve las unidades de todos los productos.
    public static int calcularTotalUnidades(String[] productos, int[] cantidades) {
        // Escribe aquí el ciclo para calcular la suma.
        return 0;
    }
}

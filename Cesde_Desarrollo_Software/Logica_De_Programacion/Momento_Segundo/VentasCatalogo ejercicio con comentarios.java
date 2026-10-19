import java.util.Scanner;

public class VentasCatalogo {

    public static void main(String[] args) {
        // PASO PRIMERO: Preparar los datos de la caja.
        // Aquí guardamos los precios y ponemos en cero los contadores de la compra.
        Scanner scanner = new Scanner(System.in);

        final String PRODUCTO_BASICO = "Básico";
        final String PRODUCTO_MEDIO = "Medio";
        final String PRODUCTO_PREMIUM = "Premium";
        final double PRECIO_BASICO = 20000.0;
        final double PRECIO_MEDIO = 50000.0;
        final double PRECIO_PREMIUM = 80000.0;
        final double PORCENTAJE_DESCUENTO = 0.10;
        final double IVA = 0.19;

        double totalBruto = 0.0;
        double descuento = 0.0;
        double valorConDescuento;
        double valorIva;
        double totalFinal;
        int totalArticulos = 0;
        int articulosPremium = 0;
        int opcion;

        // PASO SEGUNDO: Mostrar el menú una y otra vez.
        // La caja sigue abierta hasta que se elige "Finalizar compra".
        do {
            System.out.println("\n=== Caja registradora ===");
            System.out.println("1. Producto " + PRODUCTO_BASICO + " - $" + PRECIO_BASICO);
            System.out.println("2. Producto " + PRODUCTO_MEDIO + " - $" + PRECIO_MEDIO);
            System.out.println("3. Producto " + PRODUCTO_PREMIUM + " - $" + PRECIO_PREMIUM);
            System.out.println("4. Finalizar compra");
            System.out.print("Selecciona una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ingresa un número del 1 al 4: ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            // PASO TERCERO: Agregar el producto que se escogió.
            // Cada vez que se elige uno, se suma su precio a esta compra.
            if (opcion == 1) {
                totalBruto += PRECIO_BASICO;
                totalArticulos++;
                System.out.println(PRODUCTO_BASICO + " agregado a la compra.");
            } else if (opcion == 2) {
                totalBruto += PRECIO_MEDIO;
                totalArticulos++;
                System.out.println(PRODUCTO_MEDIO + " agregado a la compra.");
            } else if (opcion == 3) {
                totalBruto += PRECIO_PREMIUM;
                totalArticulos++;
                articulosPremium++;
                System.out.println(PRODUCTO_PREMIUM + " agregado a la compra.");
            } else if (opcion == 4) {
                System.out.println("Finalizando compra...");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.printf("Total bruto actual: $%.2f%n", totalBruto);
        } while (opcion != 4);

        // PASO CUARTO: Dar el descuento cuando la compra pasa de $100.000.
        // Si queda justo en $100.000, el descuento no se aplica.
        if (totalBruto > 100000.0) {
            descuento = totalBruto * PORCENTAJE_DESCUENTO;
        }
        valorConDescuento = totalBruto - descuento;

        // PASO QUINTO: Calcular el IVA sobre el precio después del descuento.
        // Luego sumamos ese impuesto al precio para saber cuánto se paga.
        valorIva = valorConDescuento * IVA;
        totalFinal = valorConDescuento + valorIva;

        // PASO SEXTO: Ver qué parte de los artículos fue Premium.
        // El cambio a decimal permite mostrar partes del porcentaje; si no hay artículos, queda en cero.
        double porcentajePremium = 0.0;
        if (totalArticulos > 0) {
            porcentajePremium = ((double) articulosPremium / totalArticulos) * 100;
        }

        // PASO SÉPTIMO: Mostrar la factura con los valores de la compra.
        // También mostramos cuántos artículos Premium se llevaron.
        System.out.println("\n=========== FACTURA ===========");
        System.out.println("Artículos en la compra: " + totalArticulos);
        System.out.println("Artículos premium: " + articulosPremium);
        System.out.printf("Total bruto:         $%.2f%n", totalBruto);
        System.out.printf("Descuento:           $%.2f%n", descuento);
        System.out.printf("Base con descuento:  $%.2f%n", valorConDescuento);
        System.out.printf("IVA (19%%):           $%.2f%n", valorIva);
        System.out.printf("TOTAL A PAGAR:       $%.2f%n", totalFinal);
        System.out.printf("Porcentaje premium:  %.2f%%%n", porcentajePremium);
        System.out.println("===============================");

        scanner.close();
    }
}

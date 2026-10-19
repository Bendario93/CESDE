import java.util.Scanner;
// import = importar.

public class VentasCatalogo {
    // public = público; class = clase.

    public static void main(String[] args) {
        // public = público; static = estático; void = vacío.

        // PASO PRIMERO: preparar los precios y los contadores de la compra.
        Scanner scanner = new Scanner(System.in);
        // new = nuevo.

        final int PRECIO_BASICO = 20000;
        // final = final; int = número entero.
        final int PRECIO_MEDIO = 50000;
        // final = final; int = número entero.
        final int PRECIO_PREMIUM = 80000;
        // final = final; int = número entero.
        final int PORCENTAJE_DESCUENTO = 10;
        // final = final; int = número entero.
        final int IVA = 19;
        // final = final; int = número entero.

        int totalBruto = 0;
        // int = número entero.
        int descuento = 0;
        // int = número entero.
        int valorConDescuento;
        // int = número entero.
        int valorIva;
        // int = número entero.
        int totalFinal;
        // int = número entero.
        int totalArticulos = 0;
        // int = número entero.
        int articulosPremium = 0;
        // int = número entero.
        int opcion;
        // int = número entero.

        // PASO SEGUNDO: mostrar el menú hasta que se termine la compra.
        do {
            // do = hacer.
            System.out.println("\n=== Caja registradora ===");
            System.out.println("1. Producto Básico - $" + PRECIO_BASICO);
            System.out.println("2. Producto Medio - $" + PRECIO_MEDIO);
            System.out.println("3. Producto Premium - $" + PRECIO_PREMIUM);
            System.out.println("4. Finalizar compra");
            System.out.print("Selecciona una opción: ");

            while (!scanner.hasNextInt()) {
                // while = mientras.
                System.out.print("Escribe un número del 1 al 4: ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            // PASO TERCERO: sumar el precio del producto elegido.
            if (opcion == 1) {
                // if = si.
                totalBruto += PRECIO_BASICO;
                totalArticulos++;
                System.out.println("Producto Básico agregado.");
            } else if (opcion == 2) {
                // else if = si no, si.
                totalBruto += PRECIO_MEDIO;
                totalArticulos++;
                System.out.println("Producto Medio agregado.");
            } else if (opcion == 3) {
                // else if = si no, si.
                totalBruto += PRECIO_PREMIUM;
                totalArticulos++;
                articulosPremium++;
                System.out.println("Producto Premium agregado.");
            } else if (opcion == 4) {
                // else if = si no, si.
                System.out.println("Finalizando compra...");
            } else {
                // else = si no.
                System.out.println("Esa opción no existe.");
            }

            System.out.println("Total bruto actual: $" + totalBruto);
        } while (opcion != 4);
        // while = mientras.

        // PASO CUARTO: restar el 10 % si la compra supera $100.000.
        if (totalBruto > 100000) {
            // if = si.
            descuento = totalBruto * PORCENTAJE_DESCUENTO / 100;
        }
        valorConDescuento = totalBruto - descuento;

        // PASO QUINTO: calcular el IVA y sumarlo al total.
        valorIva = valorConDescuento * IVA / 100;
        totalFinal = valorConDescuento + valorIva;

        // PASO SEXTO: calcular qué porcentaje de los artículos fue Premium.
        double porcentajePremium = 0.0;
        // double = número decimal.
        if (totalArticulos > 0) {
            // if = si.
            porcentajePremium = (double) articulosPremium / totalArticulos * 100;
            // double = número decimal.
        }

        // PASO SÉPTIMO: mostrar la factura con valores enteros.
        System.out.println("\n=========== FACTURA ===========");
        System.out.println("Artículos en la compra: " + totalArticulos);
        System.out.println("Artículos Premium: " + articulosPremium);
        System.out.println("Total bruto: $" + totalBruto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total después del descuento: $" + valorConDescuento);
        System.out.println("IVA (19 %): $" + valorIva);
        System.out.println("Total a pagar: $" + totalFinal);
        System.out.println("Porcentaje Premium: " + porcentajePremium + "%");
        System.out.println("===============================");

        scanner.close();
    }
}

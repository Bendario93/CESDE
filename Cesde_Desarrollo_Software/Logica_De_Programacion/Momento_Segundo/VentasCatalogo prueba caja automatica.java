public class PruebaCajaAutomatica {
    public static void main(String[] args) {
        System.out.println("=== COMENZAR PRUEBA AUTOMÁTICA ===");
        System.out.println("Iniciando toma de datos...");

        final int PRECIO_BASICO = 20000;
        final int PRECIO_MEDIO = 50000;
        final int PRECIO_PREMIUM = 80000;
        final int IVA = 19;

        int contador = 0;
        int totalBruto = 0;
        int articulosPremium = 0;

        System.out.println("\n=== EJECUTANDO DATOS INGRESADOS ===");
        System.out.println("Ingresando...");
        // Agrega un producto distinto en cada vuelta y se detiene al llegar a tres.
        while (contador < 3) {
            if (contador == 0) {
                totalBruto += PRECIO_BASICO;
                System.out.println("Artículo Básico agregado.");
            } else if (contador == 1) {
                totalBruto += PRECIO_MEDIO;
                System.out.println("Artículo Medio agregado.");
            } else {
                totalBruto += PRECIO_PREMIUM;
                articulosPremium++;
                System.out.println("Artículo Premium agregado.");
            }
            contador++;
        }

        int descuento = 0;
        if (totalBruto > 100000) {
            descuento = totalBruto * 10 / 100;
        }

        int valorConDescuento = totalBruto - descuento;
        int valorIva = valorConDescuento * IVA / 100;
        int totalFinal = valorConDescuento + valorIva;
        double porcentajePremium = (double) articulosPremium / contador * 100;

        System.out.println("\n=== RESULTADO DE LOS PRODUCTOS INGRESADOS ===");
        System.out.println("Generando facturación...");
        System.out.println("Artículos agregados: " + contador);
        System.out.println("Total bruto: $" + totalBruto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + valorIva);
        System.out.println("Total a pagar: $" + totalFinal);
        System.out.println("Porcentaje Premium: " + porcentajePremium + "%");
        System.out.println("Transacción finalizada.");
    }
}

import java.util.Scanner;

public class Ascensor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pisoActual = 1;

        System.out.println("El ascensor inicia en el piso " + pisoActual + ".");
        System.out.print("¿A qué piso desea subir? (2-24): ");
        int destino = entrada.nextInt();

        if (destino < 2 || destino > 24) {
            System.out.println("El piso debe estar entre 2 y 24.");
        } else {
            while (pisoActual < destino) {
                pisoActual++;
                System.out.println("Subiendo... piso " + pisoActual);
            }
            System.out.println("Llegó al piso " + pisoActual + ".");
        }

        entrada.close();
    }
}

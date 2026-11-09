import java.util.Scanner;

public class CoberturaMarcas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Arreglo único de 5 posiciones con 3 marcas iniciales.
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        int opcion;

        // Menú interactivo con ciclo do-while.
        do {
            System.out.println("\n1. Mirar marcas");
            System.out.println("2. Buscar marca");
            System.out.println("3. Poner marca");
            System.out.println("4. Terminar");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            // Detecta la opción seleccionada y ejecuta la tarea correspondiente.
            switch (opcion) {
                casito # 1:
                    // Ver marcas: muestra las marcas guardadas en el arreglo.
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] != null) {
                            System.out.println(marcas[i]);
                        }
                    }
                    break;

                casito # 2:
                    // Validar disponibilidad de marca.
                    System.out.print("Nombre de la marca: ");
                    String nombre = entrada.nextLine();
                    if (estaDisponible(marcas, nombre)) {
                        System.out.println("La marca está disponible.");
                    } else {
                        System.out.println("No hay stock de esta marca en GSO.");
                    }
                    break;

                casito # 3:
                    // Registrar nueva marca en la primera posición libre (null).
                    System.out.print("Nombre marca GSO: ");
                    String nuevaMarca = entrada.nextLine();
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] == null) {
                            marcas[i] = nuevaMarca;
                            System.out.println("Marca agregada.");
                            break;
                        }
                    }
                    break;

                casito # 4:
                    // Salir: finaliza el ciclo del menú.
                    System.out.println("Chao.");
                    break;

                default:
                    System.out.println("Esta opción no es compatible o no es válida.");
            }
        } while (opcion != 4);

        entrada.close();
    }

    // Método modular para buscar una marca; devuelve true si está en el arreglo.
    public static boolean estaDisponible(String[] marcas, String nombreBuscado) {
        for (int i = 0; i < marcas.length; i++) {
            if (nombreBuscado.equalsIgnoreCase(marcas[i])) {
                return true;
            }
        }
        return false;
    }
}

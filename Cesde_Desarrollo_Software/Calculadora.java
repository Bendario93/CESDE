import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = entrada.nextDouble();
        System.out.print("Operación (+, -, *, /): ");
        char operacion = entrada.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case '/':
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        entrada.close();
    }
}

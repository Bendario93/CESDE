import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Scanner;

public class RegistrarCita {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre del paciente: ");
        String nombre = entrada.nextLine();
        System.out.print("Teléfono: ");
        String telefono = entrada.nextLine();
        System.out.print("Fecha de la cita (AAAA-MM-DD): ");
        String fecha = entrada.nextLine();
        System.out.print("Motivo de la cita: ");
        String motivo = entrada.nextLine();

        String url = "jdbc:mysql://localhost:3306/consultorio_odontologico";
        String usuario = "root";
        String contrasena = "tu_contrasena";

        String sql = "INSERT INTO citas (nombre_paciente, telefono, fecha_cita, motivo) VALUES (?, ?, ?, ?)";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             PreparedStatement consulta = conexion.prepareStatement(sql)) {

            consulta.setString(1, nombre);
            consulta.setString(2, telefono);
            consulta.setDate(3, Date.valueOf(fecha));
            consulta.setString(4, motivo);

            int filasGuardadas = consulta.executeUpdate();
            if (filasGuardadas > 0) {
                System.out.println("Cita guardada correctamente.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("La fecha debe tener el formato AAAA-MM-DD.");
        } catch (SQLException e) {
            System.out.println("No se pudo guardar la cita: " + e.getMessage());
        }

        entrada.close();
    }
}

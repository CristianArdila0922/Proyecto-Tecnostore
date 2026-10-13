package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static ConexionDB instancia;
    private Connection conexion;

    private ConexionDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecnostore_db", "root", "");
        } catch (SQLException e) {
            System.out.println("Error DB: " + e.getMessage());
        }
    }

    public static ConexionDB getInstancia() {
        if (instancia == null) instancia = new ConexionDB();
        return instancia;
    }
    public Connection getConexion() { return conexion; }
}
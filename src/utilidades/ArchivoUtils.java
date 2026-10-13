package utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ArchivoUtils {
    public static void generarReporte(String texto) {
        try (FileWriter fw = new FileWriter("reporte_ventas.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(texto);
        } catch (IOException e) {
            System.out.println("Paila socio, error al escribir: " + e.getMessage());
        }
    }
}
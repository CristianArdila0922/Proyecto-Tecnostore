package utilidades;
import java.util.regex.Pattern;
public class Validador {
    public static boolean esPositivo(double num) { return num >= 0; }
    public static boolean validarCorreo(String correo) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(correo).matches();
    }
}
package modelo;
public class Cliente {
    private int id;
    private String nombre, identificacion, correo, telefono;

    public Cliente(int id, String nombre, String identificacion, String correo, String telefono) {
        this.id = id; this.nombre = nombre; this.identificacion = identificacion;
        this.correo = correo; this.telefono = telefono;
    }
    public String getIdentificacion() { return identificacion; }
    public String getCorreo() { return correo; }
}
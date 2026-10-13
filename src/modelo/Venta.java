package modelo;
import java.time.LocalDateTime;
public class Venta {
    private int id, idCliente;
    private LocalDateTime fecha;
    private double total;

    public Venta(int id, int idCliente, LocalDateTime fecha, double total) {
        this.id = id; this.idCliente = idCliente; this.fecha = fecha; this.total = total;
    }
    public double getTotal() { return total; }
}
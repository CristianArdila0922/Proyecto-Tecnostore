package logica;
import modelo.Celular;
import modelo.Venta;
import utilidades.ArchivoUtils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorVentas {
    private List<Venta> ventas = new ArrayList<>();

    public void registrarVenta(int idVenta, int idCliente, Celular c, int cantidad) {
        if (c.getStock() >= cantidad) {
            double subtotal = c.getPrecio() * cantidad;
            double total = subtotal * 1.19; // IVA 19%
            
            c.setStock(c.getStock() - cantidad); // Actualizar stock
            Venta v = new Venta(idVenta, idCliente, LocalDateTime.now(), total);
            ventas.add(v);
            
            String reporte = "Venta ID: " + idVenta + " | Total con IVA: $" + total;
            ArchivoUtils.generarReporte(reporte);
            System.out.println("Venta coronada. " + reporte);
        } else {
            System.out.println("No hay stock suficiente mi pez.");
        }
    }
}
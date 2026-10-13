import logica.GestorCelulares;
import logica.GestorVentas;
import modelo.CategoriaGama;
import patrones.FactoryCelular;
import utilidades.ArchivoUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("=== TECNOSTORE - CORONANDO BD ===");
        System.out.println("=================================");
        
        GestorCelulares gestorCelulares = new GestorCelulares();
        GestorVentas gestorVentas = new GestorVentas();
        
        gestorCelulares.agregarCelular(FactoryCelular.crear(1, "Apple", "iPhone 13", 3000000, 3, "iOS", CategoriaGama.ALTA));
        gestorCelulares.agregarCelular(FactoryCelular.crear(2, "Samsung", "Galaxy A54", 1500000, 10, "Android", CategoriaGama.MEDIA));
        
        gestorCelulares.reporteStockBajo();
        
        System.out.println("\nGenerando Venta de prueba...");
        gestorVentas.registrarVenta(1, 101, gestorCelulares.buscar(1), 1);
        
        System.out.println("\nEl archivo reporte_ventas.txt fue actualizado.");
    }
}
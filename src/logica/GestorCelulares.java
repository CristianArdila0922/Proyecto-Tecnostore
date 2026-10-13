package logica;
import modelo.Celular;
import utilidades.Validador;
import java.util.ArrayList;
import java.util.List;

public class GestorCelulares {
    private List<Celular> inventario = new ArrayList<>();

    public void agregarCelular(Celular c) {
        if (Validador.esPositivo(c.getPrecio()) && Validador.esPositivo(c.getStock())) {
            inventario.add(c);
        } else {
            System.out.println("Datos paila, rey. Ingrese valores positivos.");
        }
    }

    public void reporteStockBajo() {
        System.out.println("--- Celulares con menos de 5 unidades ---");
        inventario.stream().filter(c -> c.getStock() < 5).forEach(System.out::println);
    }
    
    public Celular buscar(int id) {
        return inventario.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
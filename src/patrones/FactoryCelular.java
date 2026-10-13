package patrones;
import modelo.Celular;
import modelo.CategoriaGama;

public class FactoryCelular {
    public static Celular crear(int id, String marca, String modelo, double precio, int stock, String so, CategoriaGama gama) {
        return new Celular(id, marca, modelo, precio, stock, so, gama);
    }
}
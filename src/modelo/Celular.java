package modelo;
public class Celular {
    private int id;
    private String marca, modelo, sistemaOperativo;
    private double precio;
    private int stock;
    private CategoriaGama gama;

    public Celular(int id, String marca, String modelo, double precio, int stock, String sistemaOperativo, CategoriaGama gama) {
        this.id = id; this.marca = marca; this.modelo = modelo; this.precio = precio; 
        this.stock = stock; this.sistemaOperativo = sistemaOperativo; this.gama = gama;
    }

    public int getId() { return id; }
    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return id + " | " + marca + " " + modelo + " | Precio: $" + precio + " | Stock: " + stock;
    }
}
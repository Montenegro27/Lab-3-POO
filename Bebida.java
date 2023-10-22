// Universidad del Valle de Guatemala - POO - 10
// Mauricio Enrique Montenegro Gonzalez - 23679
// Laboratorio 3
public class Bebida extends Producto {
    private int mililitros;
    private String tipo;

    public Bebida(int id, String nombre, int cantidadDisponible, int cantidadVendidos, boolean estado, double precio, int mililitros, String tipo) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Bebida - " + super.toString() + ", Mililitros: " + mililitros + ", Tipo: " + tipo;
    }
}



// Universidad del Valle de Guatemala - POO - 10
// Mauricio Enrique Montenegro Gonzalez - 23679
// Laboratorio 3
public class Snack extends Producto {
    private int gramos;
    private String sabor;
    private String tamaño;

    public Snack(int id, String nombre, int cantidadDisponible, int cantidadVendidos, boolean estado, double precio, int gramos, String sabor, String tamaño) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    // Getters y setters específicos de Snack
    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String toString() {
        return "ID: " + getId() + " | Nombre: " + getNombre() + " | Cantidad Disponible: " + getCantidadDisponible() +
               " | Cantidad Vendidos: " + getCantidadVendidos() + " | Estado: " + isEstado() + " | Precio: " + getPrecio() +
               " | Gramos: " + gramos + " | Sabor: " + sabor + " | Tamaño: " + tamaño;
    }
}

// Universidad del Valle de Guatemala - POO - 10
// Mauricio Enrique Montenegro Gonzalez - 23679
// Laboratorio 3
public class Producto {
    private int id;
    private String nombre;
    private int cantidadDisponible;
    private int cantidadVendidos;
    private boolean estado;
    private double precio;

    public Producto(int id, String nombre, int cantidadDisponible, int cantidadVendidos, boolean estado, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static Producto cargarDesdeCSV(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length != 6) {
            return null; 
        }

        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        int cantidadDisponible = Integer.parseInt(partes[2]);
        int cantidadVendidos = Integer.parseInt(partes[3]);
        boolean estado = Boolean.parseBoolean(partes[4]);
        double precio = Double.parseDouble(partes[5]);

        return new Producto(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
    }

    public void vender(int cantidad) {
        if (cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
            cantidadVendidos += cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente cantidad disponible para la venta.");
        }
    }

    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Cantidad Disponible: " + cantidadDisponible +
               " | Cantidad Vendidos: " + cantidadVendidos + " | Estado: " + estado + " | Precio: " + precio;
    }
}

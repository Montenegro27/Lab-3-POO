// Universidad del Valle de Guatemala - POO - 10
// Mauricio Enrique Montenegro Gonzalez - 23679
// Laboratorio 3
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();

        // Cargar productos desde un archivo CSV
        cargarProductosDesdeCSV(inventario, "inventario.csv");

        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public static void cargarProductosDesdeCSV(List<Producto> inventario, String archivoCSV) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Producto producto = Producto.cargarDesdeCSV(linea);
                if (producto != null) {
                    inventario.add(producto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

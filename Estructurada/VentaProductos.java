package drogueria;

import java.util.HashMap;
import java.util.Map;

public class VentaProductos {
    
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> ventasPorProductoYMes = new HashMap<>();
        
        agregarVenta(ventasPorProductoYMes, "Acetaminofen", "Enero", 100);
        agregarVenta(ventasPorProductoYMes, "Acetaminofen", "Febrero", 75);
        agregarVenta(ventasPorProductoYMes, "Acetaminofen", "Marzo", 120);
        agregarVenta(ventasPorProductoYMes, "Omeprazol", "Enero", 50);
        agregarVenta(ventasPorProductoYMes, "Omeprazol", "Febrero", 60);
        agregarVenta(ventasPorProductoYMes, "Omeprazol", "Marzo", 40);
        
        for (String producto : ventasPorProductoYMes.keySet()) {
            Map<String, Integer> ventasPorMes = ventasPorProductoYMes.get(producto);
            int totalVentas = 0;
            for (int ventas : ventasPorMes.values()) {
                totalVentas += ventas;
            }
            System.out.println("Ventas de " + producto + " por mes:");
            for (String mes : ventasPorMes.keySet()) {
                int ventas = ventasPorMes.get(mes);
                double porcentaje = (double) ventas / totalVentas * 100;
                System.out.println("- " + mes + ": " + porcentaje + "%");
            }
            System.out.println();
        }
    }
    
    private static void agregarVenta(Map<String, Map<String, Integer>> ventasPorProductoYMes, 
                                      String producto, String mes, int ventas) {
        if (!ventasPorProductoYMes.containsKey(producto)) {
            ventasPorProductoYMes.put(producto, new HashMap<>());
        }
        ventasPorProductoYMes.get(producto).put(mes, ventas);
    }
}

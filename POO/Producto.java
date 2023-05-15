package drogueriapoo;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    private String nombre;
    private Map<String, Integer> ventasPorMes;
    
    public Producto(String nombre) {
        this.nombre = nombre;
        this.ventasPorMes = new HashMap<>();
    }
    
    public void agregarVenta(String mes, int ventas) {
        ventasPorMes.put(mes, ventas);
    }
    
    public void imprimirPorcentajesPorMes() {
        int totalVentas = 0;
        for (int ventas : ventasPorMes.values()) {
            totalVentas += ventas;
        }
        System.out.println("Ventas de " + nombre + " por mes:");
        for (String mes : ventasPorMes.keySet()) {
            int ventas = ventasPorMes.get(mes);
            double porcentaje = (double) ventas / totalVentas * 100;
            System.out.println("- " + mes + ": " + porcentaje + "%");
        }
        System.out.println();
    }
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Integer> getVentasPorMes() {
        return ventasPorMes;
    }

    public void setVentasPorMes(Map<String, Integer> ventasPorMes) {
        this.ventasPorMes = ventasPorMes;
    }
}

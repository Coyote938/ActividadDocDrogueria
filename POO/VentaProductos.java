package drogueriapoo;

import java.util.Scanner;

public class VentaProductos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = sc.nextInt();
        sc.nextLine();
        
        Producto[] productos = new Producto[cantidadProductos];
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i+1) + ": ");
            String nombreProducto = sc.nextLine();
            productos[i] = new Producto(nombreProducto);
        }
        
        for (int i = 0; i < cantidadProductos; i++) {
            Producto producto = productos[i];
            System.out.println("Ingreso de ventas para " + producto.getNombre() + ":");
            for (String mes : MESES) {
                System.out.print(mes + ": ");
                int ventas = sc.nextInt();
                producto.agregarVenta(mes, ventas);
            }
            producto.imprimirPorcentajesPorMes();
        }
    }
    
    private static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
}

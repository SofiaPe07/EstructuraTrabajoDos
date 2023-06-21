/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ups.edu.estructura.practica.dos.vista;

import ec.ups.edu.estructura.practica.dos.modelo.Inventario;
import java.util.Scanner;

/**
 *
 * @author Sofi Peña
 */
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Buscar el producto por nombre");
        System.out.println("3. Inventario de los productos");
        System.out.println("4. Realizar una venta");
        System.out.println("5. Lista de ventas");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        return opcion;
    }

    public String pedirNombre() {
        System.out.println("Ingrese el nombre del producto: ");
        return scanner.next();
    }
    
    public double pedirPrecio(){
        System.out.println("Ingrese el precio del producto: ");
        return scanner.nextDouble();
    }

    public String pedirCodigo() {
        System.out.print("Ingrese el codigo del producto: ");
        return scanner.next();
    }

    public int pedirCantidad() {
        System.out.print("Ingrese la cantidad del producto: ");
        return scanner.nextInt();
    }

   
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    
    public void mostrarMensaje(String mensaje, int nivel) {
        StringBuilder tabs = new StringBuilder(); 

        for (int i = 0; i < nivel; i++) {
            tabs.append("\t"); 
        }
        System.out.println(tabs.toString() + mensaje); 
    }
}
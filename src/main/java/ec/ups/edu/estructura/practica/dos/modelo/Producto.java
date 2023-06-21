/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ups.edu.estructura.practica.dos.modelo;

/**
 *
 * @author Sofi Peña
 */
public class Producto {
    //atributos 
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidad;
    private Producto siguiente;
//constructor vacio
    public Producto() {
    }
//constructor de producto
    public Producto(String nombre, String codigo, double precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.siguiente = null;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }
    
    
//to string
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }  
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ups.edu.estructura.practica.dos.modelo;

import java.util.Stack;

/**
 *
 * @author Sofi Peña
 */
public class Pila<T> {
    //atributos con <T> por que van a ser genericos
 
    private Stack<T> pila;
    private double size;

    public Pila() {
        pila = new Stack<>();
        this.size = 0;
    }
    
    //metodo para agregar
    public void agregar(T elemento){
        pila.push(elemento);
        size++;
    }
    //metodo para procesar los productos
    public T procesar(){
        return pila.pop();
    }
    
    
    public boolean estaVacia(){
        return pila.isEmpty();
    }
    //para poder ver la lista de productos guardada
    
    public void verElementos(Stack<T> pila){
        for (T t : pila) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Pila{" + pila + '}';
    }  
}
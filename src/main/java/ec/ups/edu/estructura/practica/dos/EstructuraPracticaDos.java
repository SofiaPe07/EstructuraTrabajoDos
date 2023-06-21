/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.ups.edu.estructura.practica.dos;

import ec.ups.edu.estructura.practica.dos.controlador.Controlador;
import ec.ups.edu.estructura.practica.dos.vista.Vista;

/**
 *
 * @author Sofi Peña
 */
public class EstructuraPracticaDos {
    //se ejecuta el programa

    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador con = new Controlador(vista);
        con.iniciar();
              
    }
}


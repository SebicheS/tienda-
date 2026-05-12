/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class NodoCarrito {
    public String nombre;
    public String precio;
    public NodoCarrito sig, ant;

    public NodoCarrito(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.sig = this.ant = null;
    }
}
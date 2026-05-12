/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.NodoCarrito;
import javax.swing.JOptionPane;
/**
 *
 * @author Laptop HP 255 G10
 */
public class ColaCarrito {
   
    public NodoCarrito inicio;

    public ColaCarrito() {
        inicio = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregar(String nombre, String precio) {
        NodoCarrito nuevo = new NodoCarrito(nombre, precio);
        if (esVacia()) {
            inicio = nuevo;
            inicio.sig = inicio;
            inicio.ant = inicio;
        } else {
            nuevo.sig = inicio;
            nuevo.ant = inicio.ant;
            inicio.ant.sig = nuevo;
            inicio.ant = nuevo;
        }
        JOptionPane.showMessageDialog(null,
            "\"" + nombre + "\" agregado al carrito.");
    }

    public void mostrarCarrito() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null,
                "El carrito está vacío.");
            return;
        }
        StringBuilder sb = new StringBuilder("CARRITO DE COMPRAS:\n");
        sb.append("─────────────────────────\n");
        NodoCarrito p = inicio;
        int i = 1;
        do {
            sb.append(i++).append(". ").append(p.nombre)
              .append("  ->  ").append(p.precio).append("\n");
            p = p.sig;
        } while (p != inicio);
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
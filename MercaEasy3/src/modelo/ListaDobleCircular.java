package modelo;

import modelo.Nodo;
import modelo.Nodo;

public class ListaDobleCircular {

    private Nodo cabeza;
    private int  tamanio;

    public ListaDobleCircular() {
        cabeza  = null;
        tamanio = 0;
    }

    public void insertar(String usuario, String contrasena) {
        Nodo nuevo = new Nodo(usuario, contrasena);
        if (cabeza == null) {
            cabeza           = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior  = cabeza;
        } else {
            Nodo ultimo      = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior   = ultimo;
            nuevo.siguiente  = cabeza;
            cabeza.anterior  = nuevo;
        }
        tamanio++;
    }

    public boolean validar(String usuario, String contrasena) {
        if (cabeza == null) return false;
        Nodo actual = cabeza;
        do {
            if (actual.usuario.equals(usuario) &&
                actual.contrasena.equals(contrasena)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        return false;
    }

    public void mostrarAdelante() {
        if (cabeza == null) return;
        Nodo actual = cabeza;
        do {
            System.out.println("Usuario: " + actual.usuario);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public int getTamanio() { return tamanio; }
    public Nodo getCabeza() { return cabeza;  }
}
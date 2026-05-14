package modelo;

public class Nodo {
    
    public String usuario;
    public String contrasena;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(String usuario, String contrasena) {
        this.usuario    = usuario;
        this.contrasena = contrasena;
        this.siguiente  = null;
        this.anterior   = null;
    }
}
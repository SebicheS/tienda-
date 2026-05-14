package modelo;

import java.io.*;
import java.util.*;

public class LoginArchivo {

    private ListaDobleCircular listaUsuarios = new ListaDobleCircular();
    private Stack<String>      pilaIntentos  = new Stack<>();
    private Queue<String>      colaAccesos   = new LinkedList<>();

    public void cargarUsuarios(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    String[] partes = linea.split(",");
                    if (partes.length == 2) {
                        listaUsuarios.insertar(
                            partes[0].trim(),
                            partes[1].trim()
                        );
                    }
                }
            }
            br.close();
            System.out.println("=== Usuarios cargados ===");
            listaUsuarios.mostrarAdelante();
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
    }

    public boolean validarUsuario(String usuario, String contrasena) {
        boolean valido = listaUsuarios.validar(usuario, contrasena);
        if (valido) {
            colaAccesos.add(usuario);
            System.out.println("Acceso exitoso: " + usuario);
        } else {
            pilaIntentos.push(usuario + " (fallido)");
            System.out.println("Intento fallido: " + pilaIntentos.peek());
        }
        return valido;
    }

    public Stack<String>      getPilaIntentos()  { return pilaIntentos;  }
    public Queue<String>      getColaAccesos()   { return colaAccesos;   }
    public ListaDobleCircular getListaUsuarios() { return listaUsuarios; }
}
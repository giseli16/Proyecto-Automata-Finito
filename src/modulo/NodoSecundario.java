
package modulo;


public class NodoSecundario {
    private String simbolo;
    private NodoPrincipal siguiente;

    public NodoSecundario(String simbolo, NodoPrincipal siguiente) {
        this.simbolo = simbolo;
        this.siguiente = siguiente;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public NodoPrincipal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrincipal siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

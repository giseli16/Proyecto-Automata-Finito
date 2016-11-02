
package modulo;

import java.util.ArrayList;


public class NodoPrincipal {
    private boolean estadoFinal;
    private String NombreEstado;
    private ArrayList<NodoSecundario> transiciones = new ArrayList<NodoSecundario>();

    public NodoPrincipal(String NombreEstado) {
        this.NombreEstado = NombreEstado;
        this.estadoFinal = false;
    }
    
    
    public void IntroducirTranscicion(String simbolo, NodoPrincipal nodo){
        NodoSecundario newNodo = new NodoSecundario(simbolo, nodo);
        transiciones.add(newNodo);
    }
    
    public void CambiarEstadoFinal(boolean estadoFinal){
        this.estadoFinal = estadoFinal;
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public String getNombreEstado() {
        return NombreEstado;
    }

    public void setNombreEstado(String NombreEstado) {
        this.NombreEstado = NombreEstado;
    }

    public ArrayList<NodoSecundario> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(ArrayList<NodoSecundario> transiciones) {
        this.transiciones = transiciones;
    }

    @Override
    public String toString() {
        return "NodoPrincipal{" + "NombreEstado=" + NombreEstado + '}';
    }
    
    
    
    
}

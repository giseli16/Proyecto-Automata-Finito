
package modulo;


public class sistemaAutomata {
    private String[] nomEstados;
    private String[] nomSimbolos;
    private NodoPrincipal inicial;
    private String[] estadosFinales;
    
    public void CrearAutoma(String ruta){
        LeerArchivo leer = new LeerArchivo();
        leer.Leer(ruta);
        
        this.nomEstados = leer.getNomEstados();
        this.nomSimbolos = leer.getNomSimbolos();
        
        
        this.estadosFinales = leer.getEstadosFinales();
        
        NodoPrincipal[] estados = new NodoPrincipal[nomEstados.length];
        for (int i = 0; i < estados.length; i++) {
            if (nomEstados[i].compareTo(leer.getInicial()) == 0){
                inicial = new NodoPrincipal(nomEstados[i]);
                estados[i] = inicial;
            }   else    {
                estados[i] = new NodoPrincipal(nomEstados[i]);
            }
            
        }
        
        for (int i = 0; i < leer.getTransiciones().size(); i++) {
            for (int j = 0; j < estados.length; j++) {
                if (leer.getTransiciones().get(i).getInicial().compareTo(estados[j].getNombreEstado()) == 0){
                    for (int k = 0; k < estados.length; k++) {
                        if (leer.getTransiciones().get(i).getTermino().compareTo(estados[k].getNombreEstado()) == 0){
                            estados[j].IntroducirTranscicion(leer.getTransiciones().get(i).getSimbolo(), estados[k]);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < estadosFinales.length; i++) {
            for (int j = 0; j < estados.length; j++) {
                if (estados[j].getNombreEstado().compareTo(estadosFinales[i]) == 0){
                    estados[j].CambiarEstadoFinal(true);
                }
            }
        }
    }
    
    public boolean verificar(String cadena){
        NodoPrincipal Actual, anterior;
        anterior = null;
        Actual = inicial;
        
        if(!verificarTexto(cadena)){
            return false;
        }
        
        for (int i = 0; i < cadena.length(); i++) {
            anterior = Actual;
            for (int j = 0; j < Actual.getTransiciones().size(); j++) {
                if (Actual.getTransiciones().get(j).getSimbolo().compareTo(cadena.charAt(i) + "") == 0){
                    Actual = Actual.getTransiciones().get(j).getSiguiente();
                }
            }
            System.out.println(cadena.charAt(i));
            
        }
        
        return Actual.isEstadoFinal();
    }
    
    public boolean verificarTexto(String cadena){
        boolean aux = false;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j <nomSimbolos.length ; j++) {
                if (nomSimbolos[j].compareTo(cadena.charAt(i) +"") == 0){
                    aux = true;
                }
            }
            if (aux == false){
                return false;
            }
            aux = false;
        }
        return true;
    }
    
    
}

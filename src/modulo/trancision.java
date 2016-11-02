

package modulo;

public class trancision {
    private String inicial;
    private String simbolo;
    private String termino;

    public trancision(String inicial, String simbolo, String termino) {
        this.inicial = inicial;
        this.simbolo = simbolo;
        this.termino = termino;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }
    
    
}

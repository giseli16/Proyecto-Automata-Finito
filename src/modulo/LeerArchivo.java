
package modulo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author neko__000
 */
public class LeerArchivo {
    private String[] nomEstados;
    private String[] nomSimbolos;
    private String inicial;
    private String[] estadosFinales;
    private ArrayList<trancision> transiciones = new ArrayList<trancision>();
    
    public void Leer(String ruta){
        Scanner stdIn = new Scanner(System.in);
        Scanner fileIn;
        String line;
        try{
            fileIn = new Scanner(new FileReader(ruta));
            
            line = fileIn.nextLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            int i = 0;
            this.nomEstados = new String[Integer.parseInt(st.nextToken())];
            while (st.hasMoreTokens()) {
                this.nomEstados[i] = st.nextToken();
                i++;
            }
            
            line = fileIn.nextLine();
            StringTokenizer st1 = new StringTokenizer(line, " ");
            this.nomSimbolos = new String[Integer.parseInt(st1.nextToken())];
            i = 0;
            while (st1.hasMoreTokens()) {
                this.nomSimbolos[i] = st1.nextToken();
                i++;
            }
            
            this.inicial = fileIn.nextLine();
            
            line = fileIn.nextLine();
            StringTokenizer st2 = new StringTokenizer(line, " ");
            this.estadosFinales = new String[Integer.parseInt(st2.nextToken())];
            i = 0;
            while (st2.hasMoreTokens()) {
                this.estadosFinales[i] = st2.nextToken();
                i++;
            }
            
            while (fileIn.hasNextLine()){
                line = fileIn.nextLine();
                StringTokenizer st3 = new StringTokenizer(line);
                trancision trans = new trancision(st3.nextToken(), st3.nextToken(), st3.nextToken());
                this.transiciones.add(trans);
            }

            
            fileIn.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }

    public String[] getNomEstados() {
        return nomEstados;
    }

    public void setNomEstados(String[] nomEstados) {
        this.nomEstados = nomEstados;
    }

    public String[] getNomSimbolos() {
        return nomSimbolos;
    }

    public void setNomSimbolos(String[] nomSimbolos) {
        this.nomSimbolos = nomSimbolos;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String[] getEstadosFinales() {
        return estadosFinales;
    }

    public void setEstadosFinales(String[] estadosFinales) {
        this.estadosFinales = estadosFinales;
    }

    public ArrayList<trancision> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(ArrayList<trancision> transiciones) {
        this.transiciones = transiciones;
    }
    
    
}

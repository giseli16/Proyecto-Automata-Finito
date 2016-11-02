/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

/**
 *
 * @author neko__000
 */
public class Prueba {

    
    public static void main(String[] args) {
        
        sistemaAutomata sistema = new sistemaAutomata();
        sistema.CrearAutoma("auto2.txt");
        if (sistema.verificar("")){
            System.out.println("ci:3");
        }   else    {
            System.out.println("ño");
        }
        
    }
    
}

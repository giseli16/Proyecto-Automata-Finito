/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author giselle
 */
public class TablaPruebas {
    public ArrayList palabras = new ArrayList();

    public TablaPruebas(ArrayList palabras) {
        this.palabras= palabras;
    }
    
    public void AgregarPalabra(Cadena cadena1){
        palabras.add(cadena1);
    }
    
    public void InicializarTabla(JTable tabla){
       Vector <String> titulos = new Vector<String>();
       Vector <Vector <Object>> data = new Vector <Vector <Object>>();
       
        titulos.add("Cadena");
        titulos.add("Resultado");
        
        for (int i = 0; i < palabras.size(); i++) {
            Vector <Object> Fila = new Vector<Object>();
            
            Fila.add(((Cadena)palabras.get(i)).getCadena());
            Fila.add(((Cadena)palabras.get(i)).getResultado());
            
            data.add(Fila);
        }
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(data, titulos);
        this.establecerModeloJTable(modelo, tabla);
        
    }
        private void establecerModeloJTable(DefaultTableModel modelo, JTable tabla){
        tabla.setModel(modelo);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutas;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Aldair Cruz
 */
public class Rutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Entrada e=new Entrada();
        
        e.Abrir("RT.txt");
    }
    
}

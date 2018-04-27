/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Aldair Cruz
 */
public class Entrada {
    public Entrada(){
        
    }
    String Array[]=new String[1000];
    String Lista[]=new String[1000];
    
    public void Abrir(String link) throws FileNotFoundException, IOException {
        File f= new File(link);
        String cadena;
        String a;
        FileReader fr=new FileReader(f);
        int i=0;
        BufferedReader b= new BufferedReader(fr);
        while((cadena = b.readLine()) != null){
            System.out.println(cadena);
            
          Array[i]=cadena;
            
          i++;
        
        }
        String y;
        System.out.println("\n\n");
        Integer veces = Integer.parseInt(Array[0]) ; 
        System.out.println(veces);
        
        String z;
        char d;
        char d1;
        char d3;
        char d4;
        char d5;
        String d2;
        
        for(i=1;i<=veces;i++){
            System.out.println(Array[i]);
            z=Array[i];
            System.out.println(z.length());
        for(int x=2;x<z.length();x++){
            d1=z.charAt(0);
            d=z.charAt(x);
            d5=z.charAt(x-1);
           
         if(d=='='){
              d1=z.charAt(0);
              d5=z.charAt(x-1);
              d4=z.charAt(x+2);
              d3=z.charAt(x+1);
              d2=""+d1+d5+"="+d3+d4;
              Lista[x]=d2;
            System.out.println(Lista[x]);
          }else if( ((int)d) >= 65 && ((int)d) <= 90 ){
            // System.out.println("dvfdvf");
        }else if(((int)d5) >= 65 && ((int)d5) <= 90){
            
        }
         else{ 
                 
            d2= ""+ d1+d;
            Lista[x]=d2;
            System.out.println(Lista[x]);
         }
             
          
        }
        }
        String x = Array[1];
        System.out.println(x.charAt(3)); 
         
        //System.out.println((int)x.charAt(0));
        
        b.close();
    }

    public String[] getLista() {
        return Lista;
    }

    public void setLista(String[] Lista) {
        this.Lista = Lista;
    }

    public String[] getArray() {
        return Array;
    }

    public void setArray(String[] Array) {
        this.Array = Array;
    }
}

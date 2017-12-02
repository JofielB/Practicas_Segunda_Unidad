/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_11_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> alMiArregloLista = new ArrayList();
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        for (Integer integer : alMiArregloLista) {
            System.out.print(integer+"-");
        }
        System.out.println("");
        alMiArregloLista.add(2,8888);
        for (Integer integer : alMiArregloLista) {
            System.out.print(integer+"-");
        }
        //RECORRER CON ITERADOR
        System.out.println("");
        Iterator itRecorreArray;
        itRecorreArray=alMiArregloLista.iterator();
        while(itRecorreArray.hasNext()){
            System.out.print(itRecorreArray.next()+"-");
        }
    }
    
}

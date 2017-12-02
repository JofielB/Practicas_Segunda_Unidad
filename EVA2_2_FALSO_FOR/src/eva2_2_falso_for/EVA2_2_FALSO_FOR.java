/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_falso_for;

/**
 *
 * @author JOFIEL 14061213 
 */
public class EVA2_2_FALSO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        falsoFor(5);
        System.out.println("");
        falsoForAdelante(1, 5);
    }
    //FOR CON RECURSIVIDAD
    public static void falsoFor(int v){
        System.out.print(v + " ");
        if(v > 1){
            falsoFor(v-1);
        }
    }
    //FOR HACIA ADELANTE
    public static void falsoForAdelante(int vI, int vF){
        System.out.print(vI + " ");
        if(vI < vF){
            falsoForAdelante(vI+1, vF);
        }
    }
    
}

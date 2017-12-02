/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_cadenas;

/**
 *
 * @author jofie
 */
public class EVA2_4_CADENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 1; i < 10; i++) {
            System.out.println(crearCadena(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(crearCadena(i));
        }*/
        //
        for (int i = 1,b=8; i < 10 || b >= 1; i++) {
            if(i<10)
                System.out.println(crearCadena(i));
            else{
                System.out.println(crearCadena(b));
                b--;
            }
        }
        
    }
    public static String crearCadena(int v){
        if(v>1){
            return "*" + crearCadena(v-1);
        }else
            return "*";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_recursion_1;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA2_PRACTICA_RECURSION_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumaDigitos(1493));
    }
    public static int sumaDigitos(int valor){
        if(valor==0){
            return 0;
        }else
            return ((valor%10) + sumaDigitos(valor/10));
    }
}

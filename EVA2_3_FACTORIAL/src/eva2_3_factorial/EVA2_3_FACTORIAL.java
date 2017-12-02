/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author JOFIEL
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 3: "+factorial(3));
        System.out.println("Factorial de 5: "+factorial(5));
        System.out.println("Factorial de 10: "+factorial(10));
    }
    public static int factorial(int v) {
        if(v == 0){
            return 1;
        }else
            return v * factorial(v-1);
    }
    
}

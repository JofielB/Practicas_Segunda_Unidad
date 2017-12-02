/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_stack_overflow;

/**
 *
 * @author Jofiel
 */
public class EVA2_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursivo();
    }
    //SATURAR LA MEMORIA CON UN METODO RECURSIVO
    public static void recursivo() {
        System.out.println("Recursivo");
        recursivo();
    }
}

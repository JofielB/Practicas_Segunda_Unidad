/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_stack;

import java.util.Stack;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_14_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Double> sMiPila = new Stack();
        sMiPila.push(2.0);
        sMiPila.push(4.2);
        sMiPila.push(24.4);
        sMiPila.push(10.4);
        sMiPila.push(8.9);
        System.out.println(sMiPila.pop());
        System.out.println(sMiPila.pop());
        System.out.println(sMiPila.peek());
        System.out.println(sMiPila.peek());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_recursion_3;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA2_PRACTICA_RECURSION_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(potenciaN(3, 0));
    }

    public static int potenciaN(int numero, int potencia) {
        if (potencia > 1) {
            return numero * potenciaN(numero, potencia - 1);
        } else if (potencia == 0) {
            return 1;

        } else {
            return numero;
        }
    }

}

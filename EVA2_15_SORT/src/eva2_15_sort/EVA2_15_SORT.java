/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_sort;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_15_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> llMilista = new LinkedList();
        llMilista.add("Cereal");
        llMilista.add("Pollo");
        llMilista.add("Alitas");
        llMilista.add("Papitas");
        llMilista.add("Pizza");
        llMilista.add("Pastel");
        for (String string : llMilista) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        Collections.sort(llMilista);
        for (String string : llMilista) {
            System.out.print(string + " - ");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_collection_linked_list;

import java.util.LinkedList;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_13_COLLECTION_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        llMilista.remove(1);
        for (String string : llMilista) {
            System.out.print(string + " - ");

        }
        System.out.println("");
        llMilista.add(4, "Taquitos");
        for (String string : llMilista) {
            System.out.print(string + " - ");

        }
        System.out.println("");
        System.out.println(llMilista.size());

    }
}

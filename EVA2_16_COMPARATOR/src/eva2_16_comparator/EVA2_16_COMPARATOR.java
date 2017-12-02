/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_16_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> llMilista = new LinkedList();
        llMilista.add("Zanahoria");
        llMilista.add("Boneless");
        llMilista.add("Alitas");
        llMilista.add("Papitas");
        llMilista.add("Pizza");
        llMilista.add("Pastel");
        for (String string : llMilista) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        Comparator cmMiComparador =  new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String sCade1, sCade2;
                sCade1 = (String) o1;
                sCade2 = (String) o2;
                char c1,c2;
                c1 = sCade1.charAt(0);
                c2 = sCade2.charAt(0);
                return c2-c1;
            }
        
        };
        Collections.sort(llMilista,cmMiComparador);
        System.out.println(llMilista);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_nodos;

/**
 *
 * @author jofie
 */
public class EVA2_7_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo a = new Nodo(100);
        Nodo b = new Nodo(200);
        Nodo c = new Nodo(300);

        a.nSig = b;
        b.nSig = c;
        
        Nodo nTemp =  a;
        while (nTemp != null) {
            System.out.print(nTemp.iVal + "-");
            nTemp = nTemp.nSig;
        }
    }

}

class Nodo {

    public int iVal;
    public Nodo nSig;

    public Nodo() {
        iVal = 0;
        nSig = null;
    }

    public Nodo(int val) {
        iVal = val;
        nSig = null;
    }

}

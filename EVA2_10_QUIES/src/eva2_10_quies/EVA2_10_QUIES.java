/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_quies;

/**
 *
 * @author jofie
 */
public class EVA2_10_QUIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queues lista = new Queues();
        System.out.println(lista.leerPrimerNodo());
        for (int i = 1; i < 11; i++) {
            lista.agregarNodo(new Nodo(i));
        }
        System.out.println(lista.leerPrimerNodo());
        System.out.println(lista.removerPrimerNodo());
        System.out.println(lista.leerPrimerNodo());
        System.out.println(lista.removerPrimerNodo());
        System.out.println(lista.leerPrimerNodo());

    }
}

class Nodo {

    private int iVal;
    private Nodo nSIg;
    private Nodo nPrev;

    public Nodo() {
        iVal = 0;
        nSIg = null;
        nPrev = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nSIg = null;
        nPrev = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSIg() {
        return nSIg;
    }

    public void setnSIg(Nodo nSIg) {
        this.nSIg = nSIg;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
}

class Queues {

    private Nodo nIni;
    private Nodo nFin;

    public Queues() {
        nIni = null;
        nFin = null;
    }

    public Queues(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSIg(nNodo);//AGREGAMOS NUEVO NODO
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerPrimerNodo() {
        if (nIni == null) {
            //ES MEJOR LANZAR UNA EXEPCION
            return 0;//PUEDE SER UN VALOR VALIDO
        } else {
            return nIni.getiVal();
        }
    }

    public int removerPrimerNodo() {
        if (nIni == null) {
            //ES MEJOR LANZAR UNA EXEPCION
            return 0;//PUEDE SER UN VALOR VALIDO
        } else {
            //LLENAR Y BORRAR
            int iVal = nIni.getiVal();
            // DOS CASOS ---> 1 NODO Y MAS DE 1
            if (nIni.getnSIg() == null) {
                nIni = null;
                nFin = null;
            } else {
                nIni = nIni.getnSIg();
                nIni.setnPrev(null);
            }
            return iVal;
        }
    }
}

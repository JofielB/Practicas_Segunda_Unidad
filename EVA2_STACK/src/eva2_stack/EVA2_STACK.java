/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_stack;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA2_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila prueba = new Pila();
        prueba.agregarNodo(new Nodo(2));
        prueba.agregarNodo(new Nodo(4));
        prueba.agregarNodo(new Nodo(8));
        prueba.agregarNodo(new Nodo(10));
        prueba.imprimirPila();
        System.out.println("");
        System.out.println("La pila tiene: "+prueba.contarNodos()+" datos.");
        prueba.peek();
        prueba.pop();
        prueba.pop();
        prueba.pop();
        prueba.pop();
        prueba.pop();
        prueba.peek();
        System.out.println("La pila tiene: "+prueba.contarNodos()+" datos.");
        prueba.imprimirPila();
        
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

class Pila {

    private Nodo nIni;
    private Nodo nFin;

    public Pila() {
        nIni = null;
        nFin = null;
    }

    public Pila(Nodo nIni, Nodo nFin) {
        this.nIni = nIni;
        this.nFin = nFin;
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

    public void vaciarLista() {
        nIni = null;
        nFin = null;
    }

    public int contarNodos() {
        int contador;
        if (nIni == null) {
            contador = 0;
        } else {
            contador = 0;
            Nodo nTemp = nIni;
            while (nTemp != null) {
                contador++;
                nTemp = nTemp.getnSIg();
            }
        }
        return contador;
    }

    public void imprimirPila() {
        if (nIni == null) {
            System.out.println("Pila Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.println(nTemp.getiVal());
                nTemp = nTemp.getnPrev();
            }
        }
    }
    
    public void peek(){
        if(nFin == null)
            System.out.println("Pila Vacia");
        else
            System.out.println(nFin.getiVal());
    }
    
    public void pop(){
        if(nFin == null)
             System.out.println("Pila Vacia");
        else{
            System.out.println(nFin.getiVal());
            nFin = nFin.getnPrev();
            if(nFin != null)
                nFin.setnSIg(null);
            else
                nIni = null;
            
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_tipos_genericos;

/**
 *
 * @author jofie
 */
public class EVA2_12_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo <String> nNodo = new Nodo("100");
        System.out.println(nNodo.getValor());
    }
    
}
class Nodo<T>{
    private T valor;
    public Nodo(T nuevoValor){
        valor =  nuevoValor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_recursion_5;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA2_PRACTICA_RECURSION_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "(()";
        System.out.println(parentesisAnidados(prueba));
    }

    public static boolean parentesisAnidados(String parentesis) {
        if(parentesis.length() == 2 && (""+parentesis.charAt(0)).equals("(")&&((""+parentesis.charAt(parentesis.length()-1))).equals(")") ){
            return true;
        }
        else if(parentesis.length()<2){
            return false;
        }
        else {
            if((""+parentesis.charAt(0)).equals("(")&&((""+parentesis.charAt(parentesis.length()-1))).equals(")")){
                return parentesisAnidados(parentesis.substring(1, parentesis.length()-1));
            }else{
                return false;
            }
        }
    }
}

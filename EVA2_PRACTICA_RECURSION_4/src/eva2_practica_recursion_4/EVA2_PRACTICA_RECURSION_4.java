/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_recursion_4;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA2_PRACTICA_RECURSION_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "yyzzza";
        System.out.println(limpiarCadena(prueba));
    }
    
    public static String limpiarCadena(String palabra){
        if(palabra.length()>2){
            if((palabra.charAt(0)+"").equals((""+palabra.charAt(1)))){
                return limpiarCadena(palabra.substring(1));
            }else{
                return palabra.charAt(0) + limpiarCadena(palabra.substring(1));
            }
        }else
            return palabra;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_recursion_2;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA2_PRACTICA_RECURSION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "xxSi funxxxcioxnaxx";
        System.out.println(quitarX(prueba));
        
    }
    
    public static String quitarX(String palabra){
        if(palabra.equals("")){
            return "";
        }else if((palabra.charAt(0)+"").equals("x")){
            return "" + quitarX(palabra.substring(1));
        }
        else{
            return "" + palabra.charAt(0) + quitarX(palabra.substring(1));
        }
    }
    
}

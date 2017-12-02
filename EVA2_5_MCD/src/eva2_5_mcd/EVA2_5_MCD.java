/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_mcd;

/**
 *
 * @author jofie
 */
public class EVA2_5_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=180;
        int num2=48;
        System.out.println("El MCD de: " + num1 +","+ num2+" es: " + calcularMCD(num1, num2));        
    }
    public static int calcularMCD(int vDendo, int vDsor){
        if(vDsor==0){
            return vDendo;
        }else{
            int vResiduo = vDendo % vDsor;
            return calcularMCD(vDsor, vResiduo);
        }
    }
    
}

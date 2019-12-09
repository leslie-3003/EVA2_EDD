/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_primos;

import java.util.Scanner;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_5_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("INTRODUCE UN NUMERO");
        int val =scan.nextInt();
        if(primoIneficiente(val))
            System.out.println("PRIMO");
        else
            System.out.println("NO PRIMO");
        
    }
    public static boolean primoIneficiente(int valor){
        boolean resu = true;
        for (int i = 2; i<valor; i++){
            if ((valor % i)== 0){
                
            
                resu = false;
            break;
                
          }  
        }
        return resu;
    }
    
}

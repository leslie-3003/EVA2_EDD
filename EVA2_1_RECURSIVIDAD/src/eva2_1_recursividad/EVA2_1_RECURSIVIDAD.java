/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_recursividad;

import java.util.Scanner;

/**
 *
 * @author Leslie johana peña hernandez 18550680
 */
public class EVA2_1_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce un numero");
        int val = captu.nextInt();
        for (int i = val; i >= 1; i--) {
            System.out.print( i + "-");
            
        }
        System.out.println("");
        forFalso(val);
        System.out.println("");
      // for2
       
    }
    public static void forFalso(int val){
        System.out.print(val + " - ");
       if(val> 1)
        forFalso(val - 1);  
      
        
    }
    public static void for2 (int val, int inc) {
         System.out.print( inc + "-");
         if(inc < val)
             for2(val, inc+1);
    
    
    }
    
}

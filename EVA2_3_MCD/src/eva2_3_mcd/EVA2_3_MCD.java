/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_mcd;

import java.util.Scanner;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_3_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(mcd(180,45));
        
    }
    public static int mcd (int val1, int val2){
        //CUANDO DETENEMOS LA RECURSION
        System.out.println(val1 +  "/" +  val2);;
        if (val2== 0){
            return val1;
        }else{
            int resi = val1 % val2;
            return mcd(val2, resi);
        }
    }
    
}

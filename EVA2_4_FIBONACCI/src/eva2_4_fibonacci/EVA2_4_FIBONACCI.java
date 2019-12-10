/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class EVA2_4_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserte un número: ");
        System.out.println(fibo(in.nextInt()));
    }
    
    public static int fibo(int n1){
        System.out.println("n1 = " + n1);
        switch (n1) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibo(n1-1) + fibo(n1-2);
        }
        
    }
    }
    


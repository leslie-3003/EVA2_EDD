/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_factorial;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_2_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("fatorial de 5 = " + calculaFactorial(5));
    }
    
    
    
    public static int calculaFactorial(int val){
        System.out.println("Inicio " +  val);
        //SI VAL ==0 DETENEMOS LA RECURSIVIDAD
        if (val == 0) {
            System.out.println("Fin");
            return 1;}
        else{
                return val*calculaFactorial(val-1);
        }
    }
}
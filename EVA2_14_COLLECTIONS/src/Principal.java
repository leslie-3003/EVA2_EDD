
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String>  lListaEnla = new LinkedList <String> ();
        lListaEnla.add("Hola");
        lListaEnla.add("");
        lListaEnla.add("Mundo");
        lListaEnla.add("");
        lListaEnla.add("Cruel");
        lListaEnla.add("!!!!");
        lListaEnla.addFirst("XXXXXXXX");
        System.out.println(lListaEnla);
        
        for (String string : lListaEnla) {
            System.out.println(string + " - ");
        }
        System.out.println("");
        //CANTIDAD DE ELEMENTOS EN LA LISTA
        System.out.println("CANTIDAD DE ELEMENTOS= " + lListaEnla.size());
       //BORRAR UN ELEMENTO ESPECIFICO
        lListaEnla.remove(3);
        System.out.println(lListaEnla);
    }
    
}

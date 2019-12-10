
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *PEÑA HERNANDEZ LESLIE JOHANA 18550680

 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));//POSICION ---->1
        miLista.add(new Nodo(23));//POSICION ---->2
        miLista.add(new Nodo(2));//POSICION ---->3
        miLista.add(new Nodo(56));//POSICION ---->4
        miLista.add(new Nodo(465));//POSICION ---->5
        miLista.addBegin(new Nodo(999999)); //POSICION ---->0
        boolean vacia = miLista.isEmpty();
        if(vacia)
            System.out.println("LISTA VACIA");
        else
            System.out.println("LISTA CON NODOS");
        
        
        
        System.out.println("Añadir un nodo en una posición específica.");
        try {
            miLista.insertarAt(0, new Nodo(150));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        
        
        
        try {
            miLista.deleteAt(7);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Lista con nodo borrado: ");
        miLista.print();
        
        System.out.println("Número de Nodos: "+miLista.size());
        
        System.out.println("El valor #3 es: " + miLista.getAt(3));
    }
    
}

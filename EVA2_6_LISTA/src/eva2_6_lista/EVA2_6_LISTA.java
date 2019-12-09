/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_lista;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_6_LISTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Nodo obj1 = new Nodo();
       obj1.valor = 100;
       obj1.siguiente  = new Nodo();
       obj1.siguiente.valor = 200;
       obj1.siguiente.siguiente= new Nodo();
       obj1.siguiente.siguiente.valor= 300;
        System.out.println(obj1.valor);
        System.out.println(obj1.siguiente.valor);
        System.out.println(obj1.siguiente.siguiente.valor);
    }
    
}
//NODOS
class Nodo{
    //DATO A ALMACENAR
    int valor;
    Nodo siguiente;
    
}
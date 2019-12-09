/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol= new Arbol();
        miArbol.agregarNodo(new Nodo (13));
        miArbol.agregarNodo(new Nodo (10));
        miArbol.agregarNodo(new Nodo (18));
        miArbol.agregarNodo(new Nodo (2));
        miArbol.agregarNodo(new Nodo (11));
        miArbol.agregarNodo(new Nodo (17));
        miArbol.agregarNodo(new Nodo (20));
     //   miArbol.agregarNodo(new Nodo (16));
        miArbol.imprimePostOrder();
    }
    
    
}

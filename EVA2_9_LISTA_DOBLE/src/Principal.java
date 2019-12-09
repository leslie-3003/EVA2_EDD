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
        ListaDoble miLista = new ListaDoble();
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        System.out.println("IMPRIMIR DE INICIO A FIN");
        miLista.print();
        System.out.println("IMPRIMIR DE FIN A INICIO");
        miLista.printBack();
    }
    
}

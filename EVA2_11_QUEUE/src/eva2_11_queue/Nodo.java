/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_queue;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class Nodo {
     private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente= null;
        
    }
public Nodo (int valor){
    this.valor = valor;
    this.siguiente = null;
}
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class Nodo {
     private int valor;
    private Nodo siguiente;
    private Nodo previo;

    //CONSTRUCTORES PARA ASIRGANR VALORES
    public Nodo() {
        this.siguiente = null;
         this.previo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    //METODOS GET Y SET
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}

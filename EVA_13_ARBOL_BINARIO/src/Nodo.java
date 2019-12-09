/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *peña hernandez leslie johana 18550680
 */
public class Nodo {
     private int valor;
    private Nodo der;
    private Nodo izq;

    //CONSTRUCTORES PARA ASIRGANR VALORES
    public Nodo() {
        this.der = null;
         this.izq = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.der = null;
        this.izq = null;
    }

    //METODOS GET Y SET
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return der;
    }

    public void setDerecha(Nodo Derecha) {
        this.der = Derecha;
    }

    public Nodo getIzquierda() {
        return izq;
    }

    public void setIzquierda(Nodo Izquierda) {
        this.izq = Izquierda;
    }
    
}

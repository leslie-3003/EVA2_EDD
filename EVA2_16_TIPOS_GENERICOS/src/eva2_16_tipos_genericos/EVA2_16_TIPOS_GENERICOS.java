/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_tipos_genericos;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_16_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("Hola mundo cruel");
    }
    
}
class Nodo<T>{
     private T valor;
     Nodo sig;
     Nodo prev;
     
  public  Nodo(){
    this.sig = null;
    this.prev = null;
    
  }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
  
    
}
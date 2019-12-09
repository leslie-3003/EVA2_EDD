/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista2;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_7_LISTA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo1;
        Nodo nodo2;
        Nodo nodo3;
      nodo1 = new Nodo(32);
      nodo2 = new Nodo(17);
      nodo3 = new Nodo(5);
      
      nodo1.setSiguiente(nodo2);
      nodo2.setSiguiente(nodo3);
      
      Nodo temp = nodo1;  
      while(temp != null){
          System.out.print(temp.getValor() + "-");
            temp = temp.getSiguiente();
        }
    }
    
}
class Nodo{
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

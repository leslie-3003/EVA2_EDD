/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class ListaDoble {
     private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTÁ VACÍA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //LISTA VACIA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }
    
    //IMPRIMIR LA LISTA
    public void print(){
        Nodo temp = inicio;
        while (temp != null) {         
            System.out.println("temp = " + temp.getValor());
            temp = temp.getSiguiente();
        }
    }
    
    //IMPRIMIR LA LISTA AL REVES
    public void printBack(){
        Nodo temp = fin;
        while (temp != null) {         
            System.out.println("temp = " + temp.getValor());
            temp = temp.getPrevio();
        }
    }
    
    public int size(){
        int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {         
            temp = temp.getSiguiente();
            cont++;
        }
        return cont;
    }
    
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    public int getAt(int pos){
        //VERIFICAR si no hay nodos, si pos no es válido
        Nodo temp = inicio;
            while(pos != 0){
                    temp = temp.getSiguiente();
                    pos--;
            }
        return temp.getValor();
    }
    
}

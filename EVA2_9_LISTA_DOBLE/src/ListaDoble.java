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
} //CHECA SI LA LISTA ESTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else 
            return false;
}//AÑADIR AL FINAL
    public void add(Nodo nuevo){
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);//VEA HACIA DELANTE
            nuevo.setPrevio(fin);//VEA HACIA TRAS
            fin = nuevo;
        }
    }
//IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + "-");
            temp = temp.getSiguiente();
        }
        System.out.println();
}//IMPRIMIR LISTA DESDE ATRAS
    public void printBack(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print(temp.getValor() + "-");
            temp = temp.getPrevio();
        }
        System.out.println();
}
//CANTIDAD EN LA LISTA
    public int size(){
        int iCont =0;
        Nodo temp = inicio;
        while(temp != null){
           iCont++;
           temp = temp.getSiguiente();
        }
        return iCont;
}//VACIAL LA LISTA
    public void clear(){
        inicio = null;
        fin = null;
}//
    public int getAt(int pos){
        //VERIFICAR
                  int iCont = 0;
                  Nodo temp = inicio;
                  while(iCont < pos){
                  temp = temp.getSiguiente();
                  iCont++;
    }
    return temp.getValor();
}//AÑADIR NODO
}

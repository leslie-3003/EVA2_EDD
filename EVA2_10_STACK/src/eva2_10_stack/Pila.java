/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class Pila {
    private Nodo inicio;
    private Nodo fin;

public Pila(){
    this.inicio = null;
    this.fin = null;
}
//DEVUELVE TRUE SI LA LISTA ESTA VACIA
public boolean isEmpty(){
    if(inicio == null)
        return true;
    else 
        return false;
    
}
  //AGREGAR UN NODO AL FINAL DE LA LISTA
 public void add(Nodo nuevo){
    
        //VERIFCAR SI LA LISTA ESTA VACIA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }  else{
           /* Nodo temp = inicio;
            while(temp.getSiguiente() !=null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
           fin.setSiguiente(nuevo);
           fin = nuevo;
        }
   
}
 public void addBegin(Nodo nuevo){
     //VERIFCAR SI LA LISTA ESTA VACIA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }  else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
     }
 }
 
 //IMPRIMIR LA LISTA
 public void print(){
     Nodo temp = inicio;  
      while(temp != null){
          System.out.println(temp.getValor() + "-");
            temp = temp.getSiguiente();
 }
      
}
 //CANTIDAD DE ELEMENTOS EN LA LISTA
 public int size(){
     int cont = 0; 
      Nodo temp = inicio;
      while(temp != null){
          cont++;
          temp = temp.getSiguiente();
 
      }    
      return  cont;
}
 public void insertAt ( int pos, Nodo nuevo) throws Exception{
     
     int tama = size();
     if ((pos < 0) || (pos >= tama)){
       throw new Exception("LA POSICION ES INVALIDA"); // System.out.println("INVALIDO");
     }
     else{
         if (pos == 0){  
             addBegin(nuevo);
         }else{
             int cont = 0;
             Nodo temp = inicio;
       while(cont < (pos -1)){
         temp = temp.getSiguiente();
         cont++;
       }
       nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
         }
         
     }
     
}
 public void clear(){
  inicio = null;
  fin = null;
 }
 public void deleteAt (int pos) throws Exception{
   if(isEmpty())
       throw new Exception("esta vacia");
      
   int tama = size();
     if ((pos < 0) || (pos >= tama)){
       throw new Exception("LA POSICION ES INVALIDA");// System.out.println("INVALIDO");
   
     }
       if(tama == 1){   //SOLO UN NODO
        clear();}
       else{            //MUCHOS NODOS
           if(pos==0) {// BORAR EL PRIMERO
               inicio = inicio.getSiguiente();
           }else{     
             int cont = 0;
             Nodo temp = inicio;
       while(cont < (pos -1)){
         temp = temp.getSiguiente();
         cont++;
           }
       temp.setSiguiente(temp.getSiguiente().getSiguiente());
       if(pos  == (tama - 1))
           fin = temp;
           
           }
       }
 }
 public int getAt(int pos){
     //VERIFICAR
     int cont = 0;
             Nodo temp = inicio;
       while(cont < (pos -1)){
         temp = temp.getSiguiente();
         cont++;
 }
       return temp.getValor();
}
 //LA CIMA ES EL INICIO
 //AGREGAR NODO EN LA CIMA DE LA PILA
 public void push (Nodo nuevo){
     addBegin(nuevo);
 }
 //LEE EL NODO ENCIMA DE LA PILA
 public int peek(){
     return getAt(0);
     
 }
 //LEE Y QUITA EL NODO EN LA CIMA
 public int pop() throws Exception{
     int resu = getAt(0);
     deleteAt(0);
     return resu;
 }
 
}
 
     

//UN SOLO NODO
         //BORRAR LA ULTIMA
     
 






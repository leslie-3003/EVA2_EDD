/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class Arbol {
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
        
    }
    
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
     if(root == null){ //ARBOL VACIO
        root = nuevo;
        
    }else{
         if(nuevo.getValor()> actual.getValor()){//MAYOR -->DERECHA
             if(actual.getDerecha()==  null){
             actual.setDerecha(nuevo);
             }else{//ya hay nodo
                 agregarNodoRec(actual.getDerecha(), nuevo);
             }
         }else if(nuevo.getValor()< actual.getValor()){//MENOR -->IZQ
             if(actual.getIzquierda()== null){ //VACIO, HAY ESPACIO     
             actual.setIzquierda(nuevo);
         }else{//YA HAY UN NODO
             agregarNodoRec(actual.getIzquierda(), nuevo);
         }  
             }else{
                     System.out.println("ya existe");                    
         }
    }
}
public void imprimePostOrder(){
postOrder(root);

}
public void postOrder(Nodo actual){
if(actual != null){
//LEER IZQ
postOrder(actual.getIzquierda());
//LEER DER
postOrder(actual.getDerecha());
//IMPRIMIR
    System.out.print(actual.getValor()+ " - ");
}
}

}


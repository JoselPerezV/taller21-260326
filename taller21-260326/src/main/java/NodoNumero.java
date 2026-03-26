
public class NodoNumero {
    private int dato;              // valor que guarda el nodo
    private NodoNumero siguiente;
    
    //contructor
    public NodoNumero(int dato){
    this.dato = dato;
    this.siguiente= null;
    }
    
    //metodos Getter y setter
    public int getDato(){
    return dato;
    }
    public NodoNumero getSiguiente(){
    return siguiente;
    }
    public void setSiguiente(NodoNumero siguiente){
        this.siguiente = siguiente;
    }
}

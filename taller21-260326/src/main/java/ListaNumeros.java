
public class ListaNumeros {
    private NodoNumero cabeza; //primer Nodo de la lista
    
    public ListaNumeros(){
    cabeza= null;
    }
    
    //Insertar un numero al final de la lista 
    public void insertar(int dato){
    NodoNumero nuevo = new NodoNumero(dato);
    
    if(cabeza == null){
        cabeza = nuevo;
    }else{
    NodoNumero actual = cabeza;
    while(actual.getSiguiente()!= null){
        actual=actual.getSiguiente();
    }
    actual.setSiguiente(nuevo);
    }
    }
    
    //metodo Mostrar muestra la lista
    public void mostrar(){
    NodoNumero actual = cabeza;
    while(actual != null){
        System.out.print(actual.getDato()+ " ");
        actual = actual.getSiguiente();
    }
        System.out.println();//salto de linea
    }
    
    //metodo para sumar los elemento de la lista 
    public int sumar(){
        int suma = 0;
        NodoNumero actual = cabeza;
        while(actual != null){
            suma +=actual.getDato();
            actual = actual.getSiguiente();
        }
       return suma;
    }
    
    
}

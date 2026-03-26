
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
    
    
    
    //metodo que elimina el elemneto dictado por el teclado
    public void eliminar(int dato){
    if(cabeza == null) return;
    
    //En caso de que el elemeno a eliminar es la cabeza de la lista
    if(cabeza.getDato() == dato){
        cabeza = cabeza.getSiguiente();
        return;
    }
    
    //Recorre la lista buscando el valor que se digite
    NodoNumero actual = cabeza;
    while(actual.getSiguiente() !=  null){
        if(actual.getSiguiente().getDato() == dato){
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return;
        }
        actual = actual.getSiguiente();
    }
    
    }
    
    //Metodo que recorre la lista y cuenta cuantos elementos hay
    public int size(){
    int contador = 0;
    NodoNumero actual = cabeza;
    while(actual != null){
    contador++;
    actual = actual.getSiguiente();
    }
    return contador;    
    }
    
    
}

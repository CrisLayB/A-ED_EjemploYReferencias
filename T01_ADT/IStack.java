public interface IStack<E>{
    public void push(E item); // Agregar
   
    public E pop(); // Quitar
   
    public E peek(); // Agarrar ultimo elemento agregado
      
    public boolean empty(); // Esta vacio
   
    public int size(); // Cantidad elementos

    public String printInformation(); // Imprimir información
}

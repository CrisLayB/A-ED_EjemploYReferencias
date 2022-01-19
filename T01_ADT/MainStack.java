// Pila - Stack
import java.util.ArrayList;
import java.util.Stack;

class StackArrayList<E> implements IStack<E> {
    private ArrayList<E> data;

    public StackArrayList(){
        data = new ArrayList<E>();
    }
    
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    @Override
    public E peek() {
        return data.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public String printInformation() {        
        if(empty())
            return "La pila esta vacia";
        
        String information = "\nLa Pila contiene lo siguiente:\n";
        
        for(E element : data){
            information += "\n-> [" + element.toString() + "]";
        }
        
        return information + "\n";
    }
}

class StackJava<E> implements IStack<E>{
    private Stack<E> stacky;

    public StackJava(){
        stacky = new Stack<E>();
    }
    
    @Override
    public void push(E item) {
        stacky.push(item);
    }

    @Override
    public E pop() {
        return stacky.pop();
    }

    @Override
    public E peek() {
        return stacky.peek();
    }

    @Override
    public boolean empty() {
        return stacky.empty();
    }

    @Override
    public int size() {
        return stacky.size();
    }

    @Override
    public String printInformation() {        
        if(stacky.empty())
            return "La pila esta vacia";
        
        String information = "\nLa Pila contiene lo siguiente:\n";
        
        for(E element : stacky){
            information += "\n-> [" + element.toString() + "]";
        }
        
        return information + "\n";
    }

}

public class MainStack {
        
    public static void StackJava(){
        Stack<String> stacky = new Stack<String>();

        // Agregar elemento al stack
        stacky.push("Elemento 1");
        stacky.push("Elemento 2");
        stacky.push("Elemento 3");

        System.out.println(stacky); // Ver elementos

        // Eliminar elemento y regresar elemento eliminado
        System.out.println("Se elimino lo siguiente (POP): " + stacky.pop());

        // Agarro el ultimo elemento agregado y el que se eliminará
        System.out.println("Peek: " + stacky.peek());

        // Ver el tamaño de la stack
        System.out.println("Tamaño del stack: " + stacky.size());

        System.out.println(stacky); // Ver elementos
    }

    private static void StackString(){
        IStack<String> stackyJava = new StackArrayList<String>();

        System.out.println(stackyJava.printInformation());
        
        stackyJava.push("Element #1");
        stackyJava.push("Element #2");
        stackyJava.push("Element #3");
        
        System.out.println(stackyJava.printInformation());
        
        System.out.println(stackyJava.pop());
        
        System.out.println(stackyJava.printInformation());                
    }
    
    public static void main(String[] args) {
        // StackJava();
        StackString();
    }
}
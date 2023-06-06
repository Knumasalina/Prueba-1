import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<String>();
        nombres.add("José");
        nombres.add("Maria");
        nombres.add("Camilo");
        nombres.add("Andres");

        

        for(String nombre : nombres){
            System.out.println("nombre: " + nombre);

        }
        // copia en linked list
        LinkedList <String> listaEnlazada = new LinkedList<String>(nombres);
        System.out.println("elementos de la lista enlazada");
        for (String nombre : listaEnlazada){
            System.out.println("nombre: " + nombre);
        }


    }
}

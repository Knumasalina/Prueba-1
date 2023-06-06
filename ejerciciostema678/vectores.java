import java.util.Vector;

public class vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(0);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);

        vector.remove(2);
        vector.remove(3);

        for(int i = 0; i < vector.size(); i++){
        System.out.println("posición es: " + i + "valor es: " + vector.get(i));

        /*El problema de utilizar el vector para añadir 1000 de elementos despues de creado
        es que internamente el array se duplica para copiar los elementos existente y los nuevos
        por tal razón se genera un coste computacional muy alto debedo a la cantidad de espacio en memoria 
        que se utiliza     
        */}
    }
}

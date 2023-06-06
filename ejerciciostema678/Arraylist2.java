import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        
        ArrayList <Integer> numeros = new ArrayList<Integer>();


        for (int i = 1; i <= 10; i++){
            if (i % 2 != 0){
            numeros.add(i);  
            }      
    }
        for (int numero : numeros){
            
            System.out.println(numero);
        }
        // forma larga
        for (int i = 1; i <= 10; i++){
            numeros.add(i);  
            }

            for (int i = 0; i < numeros.size(); i++){
               int listanum = numeros.get(i);
               if (listanum % 2 == 0){
                numeros.remove(i); 
                
               }

            }
            for (int listanum : numeros){
                System.out.println(listanum);

            }

            }
    }



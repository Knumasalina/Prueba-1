import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputandPrintStream {
    public static void main(String[] args) {        
     
        try {
             try (InputStream fichero = new FileInputStream("C:\\Users\\Asus\\KeviNumaResume.pdf ");) {

               
                try{
                int dato = fichero.read();
                while (dato != -1){
                    // "EOF" (end of file)
                    System.out.print(dato);
                    dato = fichero.read();}
                
        
                }catch(IOException e){
                    System.out.println("no puedo leer el fichero: " + e.getMessage());

                }
            }
            
            }catch (Exception e) {
            System.out.println("El programa de error");

        }
        
    }
}

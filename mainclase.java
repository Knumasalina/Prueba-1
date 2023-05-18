public class mainclase {
    

/**
 * @param args
 */
public static void main(String[] args) {
    Persona persona1 = new Persona();

    persona1.setNombre("Kevin Numa");
    persona1.setEdad(20);
    persona1.setTelefono(321604097);

    System.out.println( persona1.getNombreString());
    System.out.println( persona1.getEdad());
    System.out.println( persona1.getTelefono());


    Persona persona2 = new Persona();

    persona2.setNombre("Yaneth Torres");
    persona2.setEdad(22);
    persona2.setTelefono(350005740);
   

    System.out.println( persona2.getNombreString());
    System.out.println( persona2.getEdad());
    System.out.println( persona2.getTelefono());


}
        
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;        
    }

    public String getNombreString(){
       return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;        
    }

    public int getEdad(){
       return edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;        
    }

    public int getTelefono(){
       return telefono;
    }
}


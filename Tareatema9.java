public class Tareatema9 {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Kevin Numa"); 
        cliente.setEdad(20);
        cliente.setTelefono(350483432);
        cliente.setCredito("High");

        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();{
        trabajador.setNombre("Yaneth Torres"); 
        trabajador.setEdad(22);
        trabajador.setTelefono(324678542);
        trabajador.setCredito("High");
        trabajador.setSalario(1500.00);

        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Credito: " + trabajador.credito);
        System.out.println("Salario: " + trabajador.salario);

    }
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    String credito;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setCredito(String credito){
        this.credito = credito;
    }
    public String getCredito(String credito){
        return credito;}
             
    }
    
    


class Trabajador extends Cliente{
    double salario;

    public Trabajador(){
        System.out.println("ESTOY EN LA CLASE TRABAJADOR");
    }

    public void setSalario(Double salario){
        this.salario = salario;

    }

    public double getSalario(){
        return salario;
    }
}
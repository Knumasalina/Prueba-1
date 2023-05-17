public class tarea2punto5 {

    public static void main(String[] args){
        var estacion = "lunes";

        switch (estacion) {
            case "verano":
            case "invierno":
            case "otoño":
            case "primavera":
            System.out.println("Estamos en " + estacion);
                
                break;
        
            default:
            System.out.println("No es una estacion del año");
        }

    }
    
}
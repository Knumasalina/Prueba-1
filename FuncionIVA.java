import java.util.Scanner;

public class FuncionIVA {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

                System.out.println("Ingresar el precio SIN IVA: ");

        double precio = scanner.nextDouble();
        
        double Iva = precio * 0.19;
        
        double total = precio + Iva;
        
        System.out.println("El precio total CON IVA es: " + total);
    }

    
}
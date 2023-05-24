public class funcionIVA {
    public static void main(String[] args) {
        
        double precio = Getprecio(100.0);

        System.out.println(precio + " con Iva");
    }
    static double Getprecio(double precio) {
        System.out.println(precio + " sin IVA");

        return precio = precio + precio * 0.19;
        
    }
}

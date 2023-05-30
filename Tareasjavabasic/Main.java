package Ejerciciotema4;

public class Main {
    public static void main(String[] args) {
        smartphone motorola = new smartphone("motorola", "edge 20", 3, true, "USB C", true, true);
        System.out.println("SMARTPHONE");
        System.out.println("Modelo: " + motorola.modelo);
        System.out.println("Marca: " + motorola.modelo);
        System.out.println("Botones: " + motorola.botones);
        System.out.println("Cargador: " + motorola.cargador);
        System.out.println("Tipo de cargador: " + motorola.tipoDeCarga);
        System.out.println("GPS: " + motorola.GPS);
        System.out.println("Camara: " + motorola.Camera);

        Smartwatch applewatch = new Smartwatch("Apple", "AppleWatch SE", 2, true, "inalambrica", false, false);
        System.out.println("SMARTWATCH");
        System.out.println("Modelo: " + applewatch.modelo);
        System.out.println("Marca: " + applewatch.modelo);
        System.out.println("Botones: " + applewatch.botones);
        System.out.println("Cargador: " + applewatch.cargador);
        System.out.println("Tipo de cargador: " + applewatch.tipoDeCarga);
        System.out.println("GPS: " + applewatch.GPS);
        System.out.println("Camara: " + applewatch.Camera);


    }
}

package Ejerciciotema4;

public class Smartdevice {
    // atributos 

    String marca;
    String modelo;
    int botones;
    boolean cargador;
    boolean GPS;
    boolean Camera;
    String tipoDeCarga;

    public Smartdevice(){

    }

    public Smartdevice(String marca, String modelo, int botones, boolean cargador, String tipoDeCarga, boolean gPS,
            boolean camera) {
        this.marca = marca;
        this.modelo = modelo;
        this.botones = botones;
        this.GPS = gPS;
        this.Camera = camera;
        this.cargador = cargador;
        this.tipoDeCarga = tipoDeCarga;
    }
    






    
}
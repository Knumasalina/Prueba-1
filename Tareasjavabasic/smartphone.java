package Ejerciciotema4;

public class smartphone extends Smartdevice{
    
    public smartphone(){

    }

    public smartphone(String marca, String modelo, int botones, boolean cargador, String tipoDeCarga, boolean gPS,
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
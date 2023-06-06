public class revese {
    public static void main(String[] args) {
    String cadena = "Mensaje de texto";
    char[] inverso = cadena.toCharArray();

        for( int i = inverso.length - 1; i >=0; i--){
            char caracter = inverso[i];
            System.out.print(caracter);


        }
    }


}

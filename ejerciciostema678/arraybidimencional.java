public class arraybidimencional {
    public static void main(String[] args) {
        int[][] numeros = new int[2][3];
        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;
               
        numeros [1][0] = 11;
        numeros [1][1] = 12;
        numeros [1][2] = 13;

        for(int i = 0; i < numeros.length; i++){

            for(int j = 0; j < numeros[1].length; j++){
                System.out.println("posición i: " + i + ", posición j: " + j + " = " + numeros[i][j]);
            }
        }
    }
}

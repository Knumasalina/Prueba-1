public class divideporcero {
    public static void main(String[] args) {
        divide(4,0);
        
    }

    private static int divide(int A, int B)throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse " + e);
        }
            System.out.println("Demo de código");

        return resultado;
        }

}

public class fibonacci {

    // Version iterativa: genera los primeros n terminos de la serie
    public static void generarSerie(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie de Fibonacci (" + n + " terminos):");
        generarSerie(n);
    }
}
//Autor: manfred omar Lopez Valero

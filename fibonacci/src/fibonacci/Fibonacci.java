package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 80;
        int[] a = new int[n];

        //generovani
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }

        //vypis
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int vstupF = 5;
        int x = faktorialRecursive(vstupF);
        System.out.println(vstupF + "!=" + x);

        int vstupFib = 12;
        int vysledekFib = fibonacciRecursive(vstupFib);
        System.out.println(vstupFib + ". prvek fibonacciho posloupnosti = " + vysledekFib);

    }

    public static int faktorial(int n) {
        int vysledek = 1;
        for (int i = 1; i <= n; i++) {
            vysledek = vysledek * i;
        }
        return vysledek;
    }

    public static int faktorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorialRecursive(n - 1);
    }

    public static int fibonacciRecursive(int n) {
        if (n ==0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}

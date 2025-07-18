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
        for (int i = 0; i< n;i++) {
            System.out.print(a[i]+" ");
        }
        
    }

}

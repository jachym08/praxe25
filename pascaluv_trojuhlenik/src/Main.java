
public class Main {

    /*
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5  10  10   5   1
1   6  15  20  15   6   1
     */
    public static void main(String[] args) {
        int pocetRadku = 7;

        int[][] a = new int[pocetRadku][];

//        a[0] = new int[1];
//        a[0][0] = 1;
//        a[1] = new int[2];
//        a[1][0] = 1;
//        a[1][1] = 1;
//        a[2] = new int[3];
//        a[2][0] = 1;
//        a[2][1] = a[1][0]+a[1][1];  
//        a[2][2] = 1;
//        a[3] = new int[4];
//        a[3][0] = 1;
//        a[3][1] = a[2][0]+a[2][1];
//        a[3][2] = a[2][1]+a[2][2];
//        a[3][3] = 1;
        // generovani pascalova trojuhelnika
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0) {  // prvni prvek
                    a[i][j] = 1;
                }
                else if (j == (a[i].length - 1)) {  // posledni prvek pole
                    a[i][j] = 1;
                } else {
                  a[i][j] = a[i-1][j-1]+a[i-1][j];
                }
            }

        }

        //vypis pole a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

    }

}

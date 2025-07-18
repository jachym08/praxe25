package cz.jachym.priklad1;

/**
 *
 * https://fiks.fit.cvut.cz/problems/11/1/1
 */
public class Priklad1 {

    public static void main(String[] args) {

        /* zadani 1 */
//        int[] rychlosti = {1, 1, 1};
//        int[][] body = {
//            {0, 0, 42},
//            {1, 1, 42}
//        };
//        /* zadani 2 */
        //       int[] rychlosti = {1, 2, 3};
        //       int[][] body = {
        //           {0, 0, 0},
//            {0, 0, 1},
        //           {3, 2, 0}
        //  };  
        /* zadani 3 */
        int[] rychlosti = {1, 1, 3};
        int[][] body = {
            {2, 3, 4},
            {0, 0, 0},};

        System.out.println(rychlosti[0]);

        System.out.println(body[1][2]);

        for (int i = 0; i < body.length; i++) {
            for (int j = 0; j < body[i].length; j++) {
                System.out.print(body[i][j] + " ");
            }
            System.out.println();
        }

        //poctiani
        double celkovyCas = 0;
        for (int i = 0; i < body.length - 1; i++) {
            int dx = body[i][0] - body[i + 1][0];
            int dy = body[i][1] - body[i + 1][1];
            int dz = body[i][2] - body[i + 1][2];

            double distance = Math.sqrt((dx * dx) + (dy * dy) + (dz * dz));
            int rychlost;
            if (body[i][2] < body[i + 1][2]) {
                rychlost = rychlosti[0];
            } else if (body[i][2] == body[i + 1][2]) {
                rychlost = rychlosti[1];
            } else {
                rychlost = rychlosti[2];
            }
            double t = distance / rychlost;
            celkovyCas = celkovyCas + t;

        }
        System.out.println(celkovyCas);

    }

}

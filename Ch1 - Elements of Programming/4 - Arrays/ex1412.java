public class ex1412{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15},
        };

        int[][] b = new int[a[0].length][a.length];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
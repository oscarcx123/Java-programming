public class ex1411{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {1, 2, 3, 4},
            {1, 2},
            {1, 2, 3, 4, 5, 6}
        };
        
        int[][] b = new int[a.length][];

        for (int i = 0; i < a.length; i++) {
            b[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
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
public class ex1413{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
        };
        
        for (int cnt = 0; cnt < a.length; cnt++) {
            for (int i = 0 + cnt; i < a.length; i++) {
                int t = a[cnt][i];
                a[cnt][i] = a[i][cnt];
                a[i][cnt] = t;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
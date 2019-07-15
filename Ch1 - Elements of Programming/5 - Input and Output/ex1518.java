public class ex1518 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdDraw.setXscale(0.0, (double) N);
        StdDraw.setYscale(0.0, (double) N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == j % 2) {
                    StdDraw.setPenColor(StdDraw.RED);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLACK);
                }
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
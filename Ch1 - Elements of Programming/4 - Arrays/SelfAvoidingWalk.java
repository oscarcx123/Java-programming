public class SelfAvoidingWalk{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // lattice size
        int T = Integer.parseInt(args[1]); // number of trials
        int deadEnds = 0;
        for (int t = 0; t < T; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2, y = N / 2;
            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                a[x][y] = true;
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                double r = Math.random();
                if (r < 0.25 && !a[x + 1][y]) x++;
                else if (r < 0.50 && !a[x - 1][y]) x--;
                else if (r < 0.75 && !a[x][y + 1]) y++;
                else if (r < 1.00 && !a[x][y - 1]) y--;
            }
        }
        System.out.println(100 * deadEnds / T + "% dead ends");
    }
}
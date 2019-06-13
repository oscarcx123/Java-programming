// 辗转相除法
public class ex1414{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (GCD(i, j) == 1) {
                    a[i][j] = true;
                    System.out.print("T");
                }
                else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }
    }

    public static int GCD(int a, int b) {
        if ((a == 0 && b == 1) || (a == 1 && b == 0)) {
            return 1;
        }
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
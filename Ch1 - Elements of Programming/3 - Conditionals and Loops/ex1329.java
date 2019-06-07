public class ex1329{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (GCD(i, j) == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int GCD(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
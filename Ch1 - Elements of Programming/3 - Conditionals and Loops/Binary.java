public class Binary{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int v = 1;
        while (v <= N / 2) {
            v *= 2;
        }

        int n = N;
        while (v > 0) {
            if (n < v) {
                System.out.print(0);
            }
            else {
                System.out.print(1);
                n -= v;
            }
            v /= 2;
        }
        System.out.println();
    }
}
public class FunctionGraphDemo {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++) a[i] = Math.sin(4 * Math.PI * i / N) + Math.sin(20 * Math.PI * i / N);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-2.0, 2.0);
        for (int i = 1; i <= N; i++) {
            StdDraw.line(i - 1, a[i - 1], i, a[i]);
        }
    }
}
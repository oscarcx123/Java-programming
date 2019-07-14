public class ex154 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int cnt = 0;
        double[] values = new double[N];
        while (!StdIn.isEmpty() && cnt < N) {
            values[cnt] = StdIn.readDouble();
            cnt++;
        }
        double sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += values[i];
        }
        double avg = sum / cnt;
        double var = 0.0;
        for (int i = 0; i < cnt; i++) {
            var += Math.pow(values[i] - avg, 2);
        }
        double stdev = Math.sqrt(var);
        StdOut.printf("Average = %.2f\n", avg);
        StdOut.printf("Stdev = %.2f\n", stdev);
        filter(values, cnt, avg - 1.5 * stdev, avg + 1.5 * stdev);
    }

    public static void filter(double[] values, int cnt, double lo, double hi) {
        for (int i = 0; i < cnt; i++) {
            if (values[i] >= hi || values[i] <= lo) {
                StdOut.print(values[i] + " ");
            }
        }
        StdOut.println();
    }
}
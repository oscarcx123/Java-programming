public class ex153 {
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
    }
}
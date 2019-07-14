public class ex158 {
    public static void main(String[] args) {
        int cnt = 0;
        double Geometric_log = 0.0; //计算几何平均数，使用log来避免溢出
        double Harmonic_sum = 0.0;
        while (!StdIn.isEmpty()) {
            double number = StdIn.readDouble();
            Geometric_log += Math.log(number);
            Harmonic_sum += 1.0 / number;
            cnt++;
        }
        double Geometric_mean = Math.exp(Geometric_log / cnt);
        double Harmonic_mean = Harmonic_sum / (1.0 / cnt);
        StdOut.printf("Geometric mean is %f.\n", Geometric_mean);
        StdOut.printf("Harmonic mean is %f.\n", Harmonic_mean);
    }
}
public class ex1516 {
    public static void main(String[] args) {
        int cnt = 0;
        double x = 0.0, y = 0.0, m = 0.0;
        while (!StdIn.isEmpty()) {
            double x_temp = StdIn.readDouble();
            double y_temp = StdIn.readDouble();
            double m_temp = StdIn.readDouble();
            m += m_temp;
            x += m_temp * x_temp;
            y += m_temp * y_temp;
            cnt++;            
        }
        x /= m;
        y /= m;
        StdOut.printf("Centroid is (%.2f, %.2f, %.2f)\n", m, x, y);
    }
}
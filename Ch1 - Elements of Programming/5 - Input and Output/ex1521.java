public class ex1520 {
    public static void main(String[] args) {
        double N = Double.parseDouble(args[0]);
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        for (double theta = 0.0; theta < Math.PI * 2; theta += 0.002) {
            double r = Math.sin(N * theta);
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            StdDraw.point(x, y);
        }
    }
}
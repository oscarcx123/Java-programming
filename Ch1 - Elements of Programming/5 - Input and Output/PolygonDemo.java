public class PolygonDemo {
    public static void main(String[] args) {
        double x = 0.5;
        double y = 0.5;
        double r = 0.25;
        double[] xd = {x - r, x, x + r, x};
        double[] yd = {y, y + r, y, y - r};
        StdDraw.polygon(xd, yd);
    }
}
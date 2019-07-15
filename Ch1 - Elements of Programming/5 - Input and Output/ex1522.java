public class ex1522 {
    public static void main(String[] args) {
        String input = args[0];
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double x = -1.0, y = 0.0;
        double vx = 0.015;
        int dt = 20;
        while (true) {
            if (x > 1.0) x = -1.0;
            x+= vx;
            StdDraw.clear();
            StdDraw.text(x, y, input);
            StdDraw.show(dt);
        }
    }
}
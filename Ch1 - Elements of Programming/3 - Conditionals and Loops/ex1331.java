public class ex1331{
    public static void main(String[] args) {
        double a,b;
        do {
            a = 2.0 * Math.random() - 1.0;
            b = 2.0 * Math.random() - 1.0;
        } while (Math.sqrt(a * a + b * b) > 1.0);
        double x = 2 * a * Math.sqrt(1 - a * a - b * b);
        double y = 2 * b * Math.sqrt(1 - a * a - b * b);
        double z = 1 - 2 * (a * a + b * b);
        System.out.println("x = " + x + ",y = " + y + ",z = " + z);
    }
}
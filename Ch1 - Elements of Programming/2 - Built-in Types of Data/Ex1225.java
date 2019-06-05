public class Ex1225{
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("Input out of range. Formula not valid!");
        }
        else {
            double W = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(W);
        }
    }
}
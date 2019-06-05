public class Ex1222{
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.78033;
        double result = x0 + (v0 * t) + (g * Math.pow(t, 2) / 2);
        System.out.println(result);
    }
}
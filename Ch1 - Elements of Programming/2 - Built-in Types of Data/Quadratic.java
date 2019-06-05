public class Quadratic
{
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discrinimant = b*b - 4.0*c;
        double d = Math.sqrt(discrinimant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);
    }
}
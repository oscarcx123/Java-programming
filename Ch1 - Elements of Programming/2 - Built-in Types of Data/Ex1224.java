public class Ex1224{
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double result = P * Math.exp(r * t);
        System.out.println(result);
    }
}
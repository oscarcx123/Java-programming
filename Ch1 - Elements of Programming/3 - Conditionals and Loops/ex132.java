public class ex132{
    public static void main(String[] args) {
        // ax^2 + bx + c
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("There's no real root!");
        }
        else if (a == 0) {
            double root = -c / b;
            System.out.println("root = " + root);
        }
        else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);
        }
    }
}
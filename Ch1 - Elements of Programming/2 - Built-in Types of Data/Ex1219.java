public class Ex1219{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double r = Math.random();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int result = (int) (r * (b - a + 1)) + a;
        System.out.println("range = " + a + "-" + b + "Random Int = " + result);
    }
}
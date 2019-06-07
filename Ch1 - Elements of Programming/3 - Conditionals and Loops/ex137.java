public class ex137{
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; i++) {
            if (i % 10 == 1) {
                if (i % 100 == 11) System.out.println(i + "th Hello");
                else System.out.println(i + "st Hello");
            }
            else if (i % 10 == 2) {
                if (i % 100 == 12) System.out.println(i + "th Hello");
                else System.out.println(i + "nd Hello");
            }
            else if (i % 10 == 3) {
                if (i % 100 == 13) System.out.println(i + "th Hello");
                else System.out.println(i + "rd Hello");
            }
            else System.out.println(i + "th Hello");
        }
    }
}
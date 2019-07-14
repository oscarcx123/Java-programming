public class ex1512 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int num1 = StdIn.readInt();
            int num2 = StdIn.readInt();
            double grade = (double) num1 / (double) num2;
            StdOut.printf("%-10s", name);
            StdOut.printf("%-3d", num1);
            StdOut.printf("%-3d", num2);
            StdOut.printf("%.3f\n", grade);
        }
    }
}
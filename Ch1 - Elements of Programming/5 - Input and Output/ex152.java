public class ex152 {
    public static void main(String[] args) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        while (!StdIn.isEmpty()) {
            int input = StdIn.readInt();
            if (input <= 0) {
                StdOut.printf("%d is not a positive number! Please try again!\n", input);
            }
            else {
                if (input < lo) lo = input;
                if (input > hi) hi = input;
            }
        }
        StdOut.printf("Max = %d\n", hi);
        StdOut.printf("Min = %d\n", lo);
    }
}
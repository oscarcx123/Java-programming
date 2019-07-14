public class ex151 {
    public static void main(String[] args) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        while (!StdIn.isEmpty()) {
            int input = StdIn.readInt();
            if (input < lo) lo = input;
            if (input > hi) hi = input;
        }
        StdOut.printf("Max = %d\n", hi);
        StdOut.printf("Min = %d\n", lo);
    }
}
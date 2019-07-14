public class ex156 {
    public static void main(String[] args) {
        int previousNum = 0;
        if (!StdIn.isEmpty()) {
            previousNum = StdIn.readInt();
            StdOut.print(previousNum + " ");
        }
        while (!StdIn.isEmpty()) {
            int nextNum = StdIn.readInt();
            if (nextNum != previousNum) {
                previousNum = nextNum;
                StdOut.print(previousNum + " ");
            }
        }
    }
}
public class TwentyQuestions {
    public static void main(String[] args) {
        int N = 1 + (int) (Math.random() * 1000000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int m = 0;
        while (m != N) {
            StdOut.print("What's your guess?");
            m = StdIn.readInt();
            if (m == N) StdOut.println("You win!");
            if (m < N) StdOut.println("Too low...");
            if (m > N) StdOut.println("Too high...");
        }
    }
}
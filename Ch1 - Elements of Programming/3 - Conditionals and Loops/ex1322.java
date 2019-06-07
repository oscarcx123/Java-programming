public class ex1322{
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = 1;
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < T; t++) {
            int cash = stake;
            for (; cash > 0 && cash < goal; bets++) {
                if (Math.random() < 0.5) cash++;
                else cash--;
                for (int j = 0; j < cash; j++) System.out.print("*");
                System.out.println();
            }
            if (cash == goal) {
                wins++;
                System.out.println("win!");
            }
            else System.out.println("lose!");
        }
    }
}
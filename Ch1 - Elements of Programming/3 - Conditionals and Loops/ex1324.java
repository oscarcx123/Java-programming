public class ex1324{
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        int stop = Integer.parseInt(args[3]);
        int bets = 0;
        int wins = 0;
        int sum = 0;
        for (int t = 0; t < T; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal && bets < stop) {
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            sum += cash;
        }
        System.out.println("Expected amount of money = " + sum / T);
    }
}
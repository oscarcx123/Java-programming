public class ex1314{
    public static void main(String[] args) {
        int N = 0;
        try {
            N = Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            System.out.println("Input too large!");
        }
        for (int i = 1; i < 100; i++) {
            double value = Math.pow(2, i);
            if (value > N) break;
            else System.out.println(value);
        }
    }
}
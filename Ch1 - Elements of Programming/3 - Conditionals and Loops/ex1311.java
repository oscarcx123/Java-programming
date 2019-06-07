public class ex1311{
    public static void main(String[] args) {
        for (int i = 4; i <= 11; i++) {
            double N = Math.pow(2, i);
            System.out.println(N + "\t" + Math.log10(N) + "\t" + (N * Math.log10(N)) + "\t" + Math.pow(N, 2) + "\t" + Math.pow(N, 3) + "\t" + Math.pow(2, N));
        }
    }
}
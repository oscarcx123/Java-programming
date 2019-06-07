public class Factors{
    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);
        long n = N;
        for (long i = 2; i < n / i; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
            }
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
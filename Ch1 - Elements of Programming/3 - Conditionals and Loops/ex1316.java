public class ex1316{
    public static void main(String[] args) {
        int N = 10000;
        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);
    }
}
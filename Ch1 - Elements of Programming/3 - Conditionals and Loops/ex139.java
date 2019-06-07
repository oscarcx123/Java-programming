public class ex139{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.random();
        }
        double avg = sum / N;
        System.out.println("avg = " + avg);
    }
}
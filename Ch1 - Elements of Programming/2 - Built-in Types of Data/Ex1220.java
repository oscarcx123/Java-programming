public class Ex1220{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            double r = Math.random();
            int result = (int) (r * 6) + 1;
            sum += result;
        }
        System.out.println("sum = " + sum);
    }
}
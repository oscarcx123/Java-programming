public class Ex1230{
    public static void main(String[] args) {
        double sum = 0;
        double min = 1;
        double max = 0;
        for (int i = 0; i < 5; i++) {
            double temp = Math.random();
            sum += temp;
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        double avg = sum / 5.0;
        System.out.println("avg = " + avg);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
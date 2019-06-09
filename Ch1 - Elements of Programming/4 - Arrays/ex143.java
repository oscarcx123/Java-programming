public class ex143{
    public static void main(String[] args) {
        double[] a = {1, 2, 4};
        double[] b = {4, 7, 9};
        if (a.length != b.length || a.length == 0 || b.length == 0) {
            System.out.println("Dimension Error!");
        }
        else {
            double sum = 0, distance = 0;
            for (int i = 0; i < a.length; i++) {
                sum += Math.pow(a[i] - b[i], 2);
            }
            distance = Math.sqrt(sum);
            System.out.println("Distance = " + distance);
        }
    }
}
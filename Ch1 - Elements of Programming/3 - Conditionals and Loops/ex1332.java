public class ex1332{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double max = Math.pow(N, 1.0/3.0);

        for (int a = 1; a < max; a++) {
            for (int b = 1; b < max; b++) {
                for (int c = 1; c < max; c++) {
                    for (int d = 1; d < max; d++) {
                        if (Math.pow(a, 3) + Math.pow(b, 3) == Math.pow(c, 3) + Math.pow(d, 3) && a != c && a != d) {
                            double sum = Math.pow(a, 3) + Math.pow(b, 3);
                            System.out.println(sum);
                        }
                    }
                }
            }
        }
    }
}
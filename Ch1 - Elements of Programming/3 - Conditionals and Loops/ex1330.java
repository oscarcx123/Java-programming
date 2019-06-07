public class ex1330{
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        long limit = Long.MAX_VALUE / k;
        for (int i = 1;;i++) {
            long power = (long) Math.pow(k, i);
            if (power < limit) System.out.println(power);
            else break;
        }
    }
}
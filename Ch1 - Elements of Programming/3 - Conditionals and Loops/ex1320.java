public class ex1320{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        String s = "";
        for (int n = N; n > 0; n /= base) s = (n % base) + s;
        System.out.println(s);
    }
}
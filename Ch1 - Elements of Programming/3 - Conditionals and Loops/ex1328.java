// 辗转相除法
public class ex1328{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD = " + a);
    }
}
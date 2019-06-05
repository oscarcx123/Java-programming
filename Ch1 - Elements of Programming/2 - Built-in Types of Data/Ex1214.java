public class Ex1214
{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean result = false;
        if (a % b == 0 && b % a == 0) {
             result = true;
        }
        System.out.println(result);
    }
}
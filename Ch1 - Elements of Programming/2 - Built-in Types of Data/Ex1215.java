public class Ex1215{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result;
        if (a + b > c && b + c > a && c + a > b) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
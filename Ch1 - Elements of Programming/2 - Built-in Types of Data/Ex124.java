public class Ex124
{
    public static void main(String[] args) {
        String start = "(!(a < b) && !(a > b))";
        String step1 = "(a >= b) && (a <= b)";
        String step2 = "a = b";
        System.out.println(start);
        System.out.println(step1);
        System.out.println(step2);
    }
}
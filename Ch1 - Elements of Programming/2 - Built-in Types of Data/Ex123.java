public class Ex123
{
    public static void main(String[] args) {
        String start = "(!(a && b) && (a || b)) || ((a && b) || !(a || b))";
        String step1 = "(false && true) || (true || false)";
        String step2 = "false || true";
        String step3 = "true";
        System.out.println(start);
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
    }
}
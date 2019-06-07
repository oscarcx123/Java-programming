public class ex136{
    public static void main(String[] args) {
        int i,j;
        for (i = 0, j = 0; i < 10; i++) j += i;
        System.out.println("j = " + j);
        for (i = 0, j = 0; i < 10; i++) j += j;
        System.out.println("j = " + j);
        for (i = 0; j < 10; j++) j += j;
        System.out.println("j = " + j);
        for (i = 0, j = 0; i < 10; i++) j += j++;
        System.out.println("j = " + j);
    }
}
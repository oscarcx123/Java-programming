public class ex144{
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length / 2 + 1; i++) {
            double t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        System.out.print("Reversed array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
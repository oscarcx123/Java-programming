public class ex141{
    public static void main(String[] args) {
        int[] a = new int[1000];
        try{
            System.out.println(a[1000]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
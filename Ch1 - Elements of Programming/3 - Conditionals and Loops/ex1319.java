public class ex1319{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        int v = 1;
        while (v <= N / base) {
            v *= base;
        }

        int n = N;
        while (v > 0) {
            int i;
            for (i = 0; n >= v; i++) {
                n -= v;
            }
            if (i < 10) {
                System.out.print(i);
            }
            else {
                switch (i) {
                    case 10: System.out.print("A");
                    case 11: System.out.print("B");
                    case 12: System.out.print("C");
                    case 13: System.out.print("D");
                    case 14: System.out.print("E");
                    case 15: System.out.print("F");
                }
            }
            v /= base;
        }
        System.out.println();
    }
}
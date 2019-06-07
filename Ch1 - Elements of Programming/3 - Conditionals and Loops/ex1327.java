public class ex1327{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("×");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("×");
                    }
                }
            }
            System.out.println();
        }
    }
}
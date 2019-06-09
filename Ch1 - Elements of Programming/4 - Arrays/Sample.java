public class Sample{
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[] perm = new int[N];

        for (int j = 0; j < N; j++) {
            perm[j] = j;
        }

        for (int i = 0; i < M; i++) {
            int r = i + (int) (Math.random() * (N - 1));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        for (int i = 0; i < M; i++) {
            System.out.print(perm[i] + " ");
        }
        System.out.println();

    }
}
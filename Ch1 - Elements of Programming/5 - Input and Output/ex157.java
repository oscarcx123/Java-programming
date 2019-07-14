public class ex157 {
    public static void main(String[] args) {
        // 样例输入ex157_input.txt中使用的N = 10
        int N = Integer.parseInt(args[0]);
        boolean[] found = new boolean[N + 1];
        int cnt = 0;
        int max_cnt = N - 1;
        while (!StdIn.isEmpty() && cnt < max_cnt) {
            int value = StdIn.readInt();
            found[value] = true;
            cnt++;
        }
        for (int i = 1; i <= N; i++) {
            if (!found[i]) StdOut.printf("The missing value is %d.\n", i);
        }
    }
}
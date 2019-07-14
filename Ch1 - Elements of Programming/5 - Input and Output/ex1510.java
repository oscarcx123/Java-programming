//这里提供的是一个等效的执行方法，跟原题要求略有差异
public class ex1510 {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        TenPenLine(RandomIntSeq(M, N));
    }
    public static void TenPenLine(int[] randomValues) {
        for (int i = 0; i < randomValues.length; i++) {
            StdOut.printf("%-4d", randomValues[i]);
            if (i % 10 == 9) StdOut.println();
        }
    }
    public static int[] RandomIntSeq(int M, int N) {
        int[] randomValues = new int[N];
        for (int i = 0; i < N; i++) {
            randomValues[i] = (int) (Math.random() * M);
        }
        return randomValues;
    }
}

/*
<原题内容>
执行命令：java RandomIntSeq 200 100 | java TenPenLine

本解答将两个程序合并为一个
*/
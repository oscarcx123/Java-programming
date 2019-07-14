public class ex155 {
    public static void main(String[] args) {
        int cur_num = 0;
        int max_num = 0;
        int cur_times = 0;
        int max_times = 0;
        while (!StdIn.isEmpty()) {
            int input = StdIn.readInt();
            if (cur_num == input) {
                cur_times += 1;
            }
            else {
                if (cur_times > max_times) {
                    max_times = cur_times;
                    max_num = cur_num;
                }
                cur_times = 1;
                cur_num = input;
            }
        }
        //最后还要检查，因为可能会有数列末尾出现一长串同样数字的情况，例如ex156_input.txt
        if (cur_times > max_times) {
            max_times = cur_times;
            max_num = cur_num;
        }
        StdOut.printf("Longest run: %d consecutive %ds.\n", max_times, max_num);
    }
}
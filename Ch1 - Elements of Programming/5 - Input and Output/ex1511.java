public class ex1511 {
    public static void main(String[] args) {
        boolean wordFound = false;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            char readIn = StdIn.readChar();
            if (readIn == ' ' && wordFound == true) {
                wordFound = false;
                cnt++;
            }
            else {
                wordFound = true;
            }
        }
        cnt++; //最后一个单词后面没有空格，所以需要额外算多一次
        StdOut.printf("Word Count = %d\n", cnt);
    }
}
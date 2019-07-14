//这里提供的是一个等效的执行方法，跟原题要求略有差异
public class ex159 {
    public static void main(String[] args) {
        String dragon = "F";
        String nogard = "F";
        String[] input = {dragon, nogard};
        Dragon(Dragon(Dragon(input))); //等价于原题的执行命令：java Dragon < input.txt | java Dragon | java Dragon
    }
    public static String[] Dragon(String[] args) {
        String dragon = args[0];
        String nogard = args[1];
        String new_dragon = dragon + "L" + nogard;
        String new_nogard = dragon + "R" + nogard;
        StdOut.println(new_dragon);
        StdOut.println(new_nogard);
        return new String[] {new_dragon, new_nogard};
    }
}

/*
<原题内容>
执行命令：java Dragon < input.txt | java Dragon | java Dragon

input.txt内容：F F

执行代码：
public class Dragon {
    public static void main(String[] args) {
        String dragon = StdIn.readString();
        String nogard = StdIn.readString();
        StdOut.print(dragon + "L" + nogard);
        StdOut.print(" ");
        StdOut.print(dragon + "R" + nogard);
        StdOut.println();
    }
}
*/
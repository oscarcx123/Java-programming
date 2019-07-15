public class ex1523 {
    public static void main(String[] args) {
        double volume = Double.parseDouble(args[0]);
        double tempo = Double.parseDouble(args[1]);
        int sps = 44100;
        while (!StdIn.isEmpty()) {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble() * tempo;
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sps * duration);
            double[] a = new double[N + 1];
            for (int i = 0; i <= N; i++) {
                a[i] = Math.sin(2 * Math.PI * i * hz / sps) * volume;
            }
            StdAudio.play(a);
        }    
    }
}
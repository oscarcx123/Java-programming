public class ex1524 {
    public static void main(String[] args) {
        String filename = args[0]; // file name
        double rate = Double.parseDouble(args[1]); // play back rate
        double[] song = StdAudio.read(filename);
        if (rate == 1) StdAudio.play(song);
        else {
            double[] modifiedSong = new double [(int) Math.floor(song.length * (1.0 / rate))];
            for (int i = 0; i < modifiedSong.length; i++) {
                modifiedSong[i] = song[(int) Math.floor(i * rate)];
            }
            StdAudio.play(modifiedSong);
        } 
    }
}
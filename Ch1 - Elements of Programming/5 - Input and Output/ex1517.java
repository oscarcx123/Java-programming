public class ex1517 {
    public static void main(String[] args) {
        double absSum = 0.0;
        double avgPowerSum = 0.0;
        double previousNum = 0;
        int zeroCrossings = 0;
        int cnt = 0;
        if (!StdIn.isEmpty()) {
            previousNum = StdIn.readDouble();
            absSum += Math.abs(previousNum);
            avgPowerSum += Math.pow(previousNum, 2);
            cnt++;
        }
        while (!StdIn.isEmpty()) {
            double input = StdIn.readDouble();
            absSum += Math.abs(input);
            avgPowerSum += Math.pow(input, 2);
            if (previousNum < 0 && input > 0) zeroCrossings++;
            if (previousNum > 0 && input < 0) zeroCrossings++;
            previousNum = input;
            cnt++;
        }
        double AvgMagnitude = absSum / (double) cnt;
        double AvgPower = avgPowerSum / (double) cnt;
        StdOut.printf("Average Magnitude is %.3f\n", AvgMagnitude);
        StdOut.printf("Average Power is %.3f\n", AvgPower);
        StdOut.printf("Number of Zero Crossings is %d\n", zeroCrossings);
    }
}
public class ex1515 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        double xi = 0;
        double yi = 0;
        double zi = 0;
        double shortestDistance = Double.POSITIVE_INFINITY;
        while (!StdIn.isEmpty()) {
            double x_temp = StdIn.readDouble();
            double y_temp = StdIn.readDouble();
            double z_temp = StdIn.readDouble();
            double distance = Math.pow((x - x_temp), 2) + Math.pow((y - y_temp), 2) + Math.pow((z - z_temp), 2);
            if (distance < shortestDistance) {
                shortestDistance = distance;
                xi = x_temp;
                yi = y_temp;
                zi = z_temp;
            }
        }
        StdOut.printf("Coordinate is (%.2f, %.2f, %.2f)\n", xi, yi, zi);
        StdOut.printf("Distance is %.2f\n", shortestDistance);
    }
}
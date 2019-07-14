public class ex1514 {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]); // year
        double P = Double.parseDouble(args[1]); // principal
        double r = Double.parseDouble(args[2]); // annual interest rate
        int month = t * 12;
        double monthly_r = r / 12.0; // monthly interest rate
        double monthly = P * monthly_r * Math.pow((monthly_r + 1.0), month) / (Math.pow((monthly_r + 1.0), month) - 1.0);
        //double monthly = P * Math.exp(r * (double) t) / (double) month; // monthly payment
        
        StdOut.println(monthly);
        for (int i = 0; i < month; i++) {
            double paid_interest = P * monthly_r;
            double paid_principal = monthly - paid_interest;
            P -= paid_principal;
            StdOut.printf("%-3d", i + 1);
            StdOut.printf("%-10.3f", P);
            StdOut.printf("%-10.3f\n", paid_interest);
        }
    }
}
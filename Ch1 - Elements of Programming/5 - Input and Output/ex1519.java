public class ex1519 {
    public static void main(String[] args) {
        // N = 圆上点的个数，p = 两点连线概率
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        // x0，y0为圆心坐标，r为半径
        double x0 = 0.5;
        double y0 = 0.5;
        double r = 0.5;
        // stepAngle为每次增加的角度，curAngle为现在角度
        double stepAngle = 360.0 / N;
        double curAngle = 0.0;
        // 使用coordinates存放圆上点的坐标
        double[][] coordinates = new double [N][2];
        for (int i = 0; i < N; i++) {
            // 通过公式计算圆上一点的坐标
            double x1 = x0 + r * Math.cos(curAngle * Math.PI / 180);
            double y1 = y0 + r * Math.sin(curAngle * Math.PI / 180);
            StdDraw.point(x1, y1);
            coordinates[i][0] = x1;
            coordinates[i][1] = y1;
            curAngle += stepAngle;
        }
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (Math.random() < p) {
                    StdDraw.line(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                }
            }
        }
    }
}
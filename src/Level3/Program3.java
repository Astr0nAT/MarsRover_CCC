package Level3;

public class Program3 {

    public static void main(String[] args) {
        double currentAngle = 0.0;
        double wheelBase = 1.00;
        double distance1 = 1.00;
        double angle1 = Math.toRadians(15.00);
        double distance2 = 1.00;
        double angle2 = 0.00;
        double distance3 = 1.00;
        double angle3 = Math.toRadians(-15.00);

        // STAGE 1

        double currentTurnRadius = wheelBase / Math.sin(angle1);
        angle1 = correctAngle(distance1 / currentTurnRadius);

        double x = currentTurnRadius - (currentTurnRadius * Math.cos(angle1));
        double y = currentTurnRadius * Math.sin(angle1);

        currentAngle += angle1;
        currentAngle = correctAngle(currentAngle);

        System.out.printf("%.20f%n", x);
        System.out.printf("%.20f%n", y);
        System.out.printf("%.20f%n%n", Math.toDegrees(currentAngle));

        System.out.printf("%.20f", currentTurnRadius);
/*

        // STAGE 2

        angle2 = currentAngle;

        x += distance2 * Math.cos(angle2);
        y += distance2 * Math.sin(angle2);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.2f%n", y);
        System.out.printf("%.2f%n%n", Math.toDegrees(currentAngle));

        // STAGE 3

        currentTurnRadius = wheelBase / Math.sin(angle3);
        angle3 = correctAngle(distance3 / currentTurnRadius);

        double X = currentTurnRadius - (currentTurnRadius * Math.cos(angle3));
        double Y = currentTurnRadius * Math.sin(angle3);

        System.out.printf("%.2f%n", X);
        System.out.printf("%.2f%n", Y);
        System.out.printf("%.2f%n%n", Math.toDegrees(angle3));

        double X1 = Math.cos(-currentAngle) * X + Math.sin(-currentAngle) * Y;
        double Y1 = - Math.sin(-currentAngle) * X + Math.cos(-currentAngle) * Y;

        x += X1;
        y += Y1;

        System.out.printf("%.2f%n", x);
        System.out.printf("%.2f%n", y);
*/


    }

    public static double correctAngle(double angle){
        while(angle >= Math.PI * 2){
            angle -= Math.PI * 2;
        }
        while(angle < 0){
            angle += Math.PI * 2;
        }
        return angle;
    }

}

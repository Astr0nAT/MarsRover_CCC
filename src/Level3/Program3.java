package Level3;

public class Program3 {

    public static void main(String[] args) {
        // String inputString = "1.00 3 1.00 15.00 1.00 0.00 1.00 -15.00";
        // String[] input = inputString.split(" ");

        double wheelBase = 2.00;
        double distance = Math.PI;
        double steeringAngle = Math.PI/2;
        double turnRadius = wheelBase / Math.sin(steeringAngle);
        System.out.printf("Turn radius: %.2f%n", turnRadius);

        double x, y, innerAngle;

        innerAngle = distance / turnRadius;

        System.out.printf("Current angle: %.2f%n", correctOutputAngle(innerAngle));

        x = turnRadius - (turnRadius * Math.sin(correctOutputAngle(innerAngle)));
        y = turnRadius * Math.cos(correctOutputAngle(innerAngle));

        System.out.printf("%.2f%n", x);
        System.out.printf("%.2f%n", y);
    }

    public static double correctOutputAngle(double a){

        while(a >= Math.PI * 2){
            a -= Math.PI * 2;
        }
        while(a < 0) {
            a += Math.PI * 2;
        }

        if(a <= Math.PI / 2){
            return Math.toDegrees(Math.PI / 2 - a);
        } else{
            return Math.toDegrees(Math.toRadians(450) - a);
        }

    }
}

package Level3;

public class Program3 {

    public static void main(String[] args) {
        String inputString = "2.00 1.00 15.00";
        String[] input = inputString.split(" ");

        double wheelBase = Double.parseDouble(input[0]);
        double distance = Math.PI;
        double steeringAngle = Math.PI/2;
        double turnRadius = wheelBase / Math.sin(steeringAngle);

        // new output variables
        double x, y, angle;

        angle = distance / turnRadius;
        while(angle >= Math.PI * 2){
            angle -= Math.PI * 2;
        }
        while(angle < 0){
            angle += Math.PI * 2;
        }

        x = turnRadius - (turnRadius * Math.cos(angle));
        y = turnRadius * Math.sin(angle);

        System.out.printf("%.2f %.2f %.2f", x, y, Math.toDegrees(angle));
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

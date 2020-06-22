package Level2;

public class Program2 {
    public static void main(String[] args) {
        String inputString = "9.53 8.12 0.00";
        String[] input = inputString.split(" ");

        double wheelBase = Double.parseDouble(input[0]);
        double distance = Double.parseDouble(input[1]);
        double steeringAngle = Double.parseDouble(input[2]);
        steeringAngle = Math.toRadians(steeringAngle);
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

}

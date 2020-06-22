package Level2;

public class Program2 {
    public static void main(String[] args) {
        String inputString = "2.70 45.00 -34.00";
        String[] input = inputString.split(" ");

        double wheelBase = Double.parseDouble(input[0]);
        double distance = Double.parseDouble(input[1]);
        double steeringAngle = Double.parseDouble(input[2]);
        steeringAngle = Math.toRadians(steeringAngle);
        double turnRadius = wheelBase / Math.sin(steeringAngle);

        // new output variables
        double x, y, newDirection;

        newDirection = Math.abs(distance / turnRadius);
        while(newDirection >= Math.PI * 2){
            newDirection -= Math.PI * 2;
        }


        System.out.printf("%.2f %.2f %.2f", 0.0, 0.0, Math.toDegrees(newDirection));
    }

}

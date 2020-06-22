package Level1;

public class Program1 {
    public static void main(String[] args) {
        // input is always a string variable
        String inputString = "1.00 30.00";
        // to use it we split it at every space (' ')
        String[] input = inputString.split(" ");

        // the first word is the wheelbase (how far the wheels are apart)
        double wheelBase = Double.parseDouble(input[0]);
        // the second word is the steering angle
        double steeringAngle = Double.parseDouble(input[1]);
        // steering angle in radians is much more useful
        steeringAngle = Math.toRadians(steeringAngle);

        // calculating turnRadius with given formula
        double turnRadius = wheelBase / Math.sin(steeringAngle);

        // printing turn radius with two digits after the comma
        System.out.printf("%.2f", turnRadius);
    }
}

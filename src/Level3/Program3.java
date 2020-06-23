package Level3;

public class Program3 {

    public static void main(String[] args) {
        String inputString = "1.00 3 1.00 15.00 1.00 0.00 1.00 -15.00";
        String[] input = inputString.split(" ");

        double wheelBase = Double.parseDouble(input[0]);
        double currentX = 0;
        double currentY = 0;
        double currentAngle = 0;
        double x, y, angle, turnRadius;

        for(int i = 0; i < Integer.parseInt(input[1]); i++){
            System.out.println("Stage " + (i + 1));
            double distance = Double.parseDouble(input[2 + (i * 2)]);
            double steeringAngle = Double.parseDouble(input[3 + (i * 2)]);
            steeringAngle = Math.toRadians(steeringAngle);

            x = 0;
            y = 0;

            if(steeringAngle == 0){
                x = distance * Math.cos(convertAngle(currentAngle));
                y = distance * Math.sin(convertAngle(currentAngle));
            }

            System.out.printf("%.2f%n", convertAngle(currentAngle));
            System.out.printf("%.2f%n", currentAngle);
            System.out.printf("%.2f%n", x);
            System.out.printf("%.2f%n", y);
            System.out.println();

        }

    }

    public static double convertAngle(double a){

        while(a >= Math.PI * 2){
            a -= Math.PI * 2;
        }
        while(a < 0) {
            a += Math.PI * 2;
        }

        if(a <= Math.PI / 2){
            return Math.PI / 2 - a;
        } else{
            return Math.toRadians(450) - a;
        }

    }
}

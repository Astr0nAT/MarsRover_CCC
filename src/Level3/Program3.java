package Level3;

public class Program3 {

    public static void main(String[] args) {
        String inputString = "1.00 1 5.00 23.00";
        String[] input = inputString.split(" ");

        double wheelBase = Double.parseDouble(input[0]);
        double absoluteX = 0;
        double absoluteY = 0;
        double currentAngle = 0;
        double stageX, stageY, angle, turnRadius, tempX, tempY;

        for(int i = 0; i < Integer.parseInt(input[1]); i++){
            double distance = Double.parseDouble(input[2 + (i * 2)]);
            double steeringAngle = Double.parseDouble(input[3 + (i * 2)]);
            steeringAngle = Math.toRadians(steeringAngle);

            if(steeringAngle == 0) {
                stageX = distance * Math.cos(convertAngle(currentAngle));
                stageY = distance * Math.sin(convertAngle(currentAngle));
                angle = 0.0;
            }
            else{
                turnRadius = wheelBase / Math.sin(steeringAngle);
                angle = distance / turnRadius;

                tempX = turnRadius - (turnRadius * Math.cos(angle));
                tempY = turnRadius * Math.sin(angle);

                stageX = Math.cos(currentAngle) * tempX + Math.sin(currentAngle) * tempY;
                stageY = -Math.sin(currentAngle) * tempX + Math.cos(currentAngle) * tempY;
            }

            absoluteX += stageX;
            absoluteY += stageY;
            currentAngle += angle;
        }

        currentAngle = trimAngle(currentAngle);
        System.out.printf("%.2f ", absoluteX);
        System.out.printf("%.2f ", absoluteY);
        System.out.printf("%.2f%n", Math.toDegrees(currentAngle));
    }

    public static double convertAngle(double a){
        a = trimAngle(a);

        if(a <= Math.PI / 2){
            return Math.PI / 2 - a;
        } else{
            return Math.toRadians(450) - a;
        }

    }

    public static double trimAngle(double a){
        while(a >= Math.PI * 2){
            a -= Math.PI * 2;
        }
        while(a < 0) {
            a += Math.PI * 2;
        }
        return a;
    }
}

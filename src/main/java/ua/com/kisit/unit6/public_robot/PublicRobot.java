package ua.com.kisit.unit6.public_robot;

public class PublicRobot {

    public double x = 0;
    public double y = 0;
    public double course = 90;
    public double distance = 0;

    @Override
    public String toString() {
        return "ProtectedRobot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {
        PublicRobot publicRobot = new PublicRobot();
        System.out.println(publicRobot);
    }
}

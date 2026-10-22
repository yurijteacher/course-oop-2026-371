package ua.com.kisit.unit6.default_robot;

public class DefaultRobot {

        double x = 0;
        double y = 0;
        double course = 90;
        double distance = 0;


    @Override
    public String toString() {
        return "DefaultRobot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {

        DefaultRobot defaultRobot = new DefaultRobot();
        System.out.println(defaultRobot);
    }
}

package ua.com.kisit.unit6.protected_robot;

import ua.com.kisit.unit6.default_robot.DefaultRobot;

public class ProtectedRobot {

    protected double x = 0;
    protected double y = 0;
    protected double course = 90;
    protected double distance = 0;

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

        ProtectedRobot protectedRobot = new ProtectedRobot();
        System.out.println(protectedRobot);
    }

}

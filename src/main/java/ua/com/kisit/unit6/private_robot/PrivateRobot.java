package ua.com.kisit.unit6.private_robot;

import ua.com.kisit.unit6.default_robot.DefaultRobot;

public class PrivateRobot {

    private double x = 0;
    private double y = 0;
    private double course = 90;
    private double distance = 0;


    @Override
    public String toString() {
        return "PrivateRobot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {

        PrivateRobot privateRobot = new PrivateRobot();
        System.out.println(privateRobot);
    }

}

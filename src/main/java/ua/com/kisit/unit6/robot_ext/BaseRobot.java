package ua.com.kisit.unit6.robot_ext;

public class BaseRobot {

    double x = 0;
    private double y = 0;
    protected double course = 90;
    public double distance = 0;

    @Override
    public String toString() {
        return "BaseRobot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}

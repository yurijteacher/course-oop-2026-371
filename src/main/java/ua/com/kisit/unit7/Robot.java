package ua.com.kisit.unit7;

public class Robot {

    private double x = 0;
    protected double y = 0;
    private double course = 0;
    private double distance = 0;

    private String model = "T1000";

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void forward(){
        x+=distance * Math.cos(course* Math.PI/180); // x = x + d x
        y+=distance * Math.sin(course*Math.PI/180);
    }


    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {

        Robot robot = new Robot();

        System.out.println(robot.toString());

        Robot robot1 = new Robot(1,1,90,100);

        System.out.println(robot1);

        robot.course = 90;
        robot.distance = 100;

        robot.forward();

        System.out.println(robot);

    }



}

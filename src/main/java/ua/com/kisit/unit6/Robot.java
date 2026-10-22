package ua.com.kisit.unit6;

import org.w3c.dom.ls.LSOutput;

import static java.lang.Math.*;
//import static java.lang.Math.cos;
//import static java.lang.Math.sin;

public class Robot {

    double x = 0;
    private double y = 0;
    protected double course = 90;
    public double distance = 0;


    double oldX = 0;
    private double oldY = 0;

    public Robot() {}

    public void forward(double x, double y){
        oldX = this.x;
        oldY = this.y;
//        this.x = x + distance * Math.cos(course*Math.PI/180);
//        this.y = y + distance * Math.sin(course*Math.PI/180);

        /*
        new X
        new Y
         */

        this.x += distance * cos(course* PI/180);
        this.y += distance * sin(course* PI/180);

    }

    public void forward(){
        oldX = this.x;
        oldY = this.y;
//        this.x = x + distance * Math.cos(course*Math.PI/180);
//        this.y = y + distance * Math.sin(course*Math.PI/180);

        /*
        new X
        new Y
         */

        this.x += distance * cos(course* PI/180);
        this.y += distance * sin(course* PI/180);

    }

//    @Override
//    public String toString(){
//        return "";
//    }


    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                ", oldX=" + oldX +
                ", oldY=" + oldY +
                '}';
    }

    static void main() {

       Robot robot = new Robot();

       robot.x = 100;
       robot.y = 200;
       robot.course = 180;
       robot.distance = 100;

       robot.forward(robot.x, robot.y);

        System.out.println(robot.toString());

        robot.course = 90;
        robot.distance = 200;

        robot.forward();

        System.out.println(robot);

        Robot robot1 = new Robot(1000);
        System.out.println(robot1);

        Robot robot2 = new Robot(1000, 2000);
        System.out.println(robot2);

        Robot robot3 = new Robot(1000, 2000, 45);
        System.out.println(robot3);

        Robot robot6 = new Robot(1000, 2000, 45, 125, 0, 0);
        System.out.println(robot6);

    }

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public Robot(double course, double distance) {
//        this.course = course;
//        this.distance = distance;
//    }


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

    public Robot(double x, double y, double course, double distance, double oldX, double oldY) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
        this.oldX = oldX;
        this.oldY = oldY;
    }


}

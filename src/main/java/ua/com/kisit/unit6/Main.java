package ua.com.kisit.unit6;

public class Main {


    static void main() {

        Robot robot = new Robot();
        robot.x = 0;
        // robot.y = 0;
        robot.distance = 100;
        robot.course = 90;

        robot.forward();

        System.out.println(robot);


        RobotT1000 t1000 = new RobotT1000();
        t1000.setX(1000);
        System.out.println(t1000.getX());


    }

}

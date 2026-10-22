package ua.com.kisit.unit7;

public class ManagerRobot {

    static void main() {

        Robot robot = new Robot();
        // robot.x = 0;

        robot.setX(100);
        robot.setY(200);

        robot.setCourse(90);
        robot.setDistance(1000);

        robot.forward();


        System.out.println(robot);



    }

}

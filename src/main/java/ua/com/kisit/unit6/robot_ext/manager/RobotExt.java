package ua.com.kisit.unit6.robot_ext.manager;

import ua.com.kisit.unit6.robot_ext.BaseRobot;

public class RobotExt extends BaseRobot {

    static void main() {

        RobotExt robotExt = new RobotExt();
        System.out.println(robotExt);

        // robotExt.x = 0;
        // robotExt.y = 0;
        robotExt.course = 270;
        robotExt.distance = 200;

//        robotExt.course = 180;
//        robotExt.distance = 100;



    }

}

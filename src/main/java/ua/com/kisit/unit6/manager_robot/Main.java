package ua.com.kisit.unit6.manager_robot;

import ua.com.kisit.unit6.default_robot.DefaultRobot;
import ua.com.kisit.unit6.private_robot.PrivateRobot;
import ua.com.kisit.unit6.protected_robot.ProtectedRobot;
import ua.com.kisit.unit6.public_robot.PublicRobot;

public class Main {

    static void main() {
        DefaultRobot defaultRobot = new DefaultRobot();
//        defaultRobot.x = 0;
//        defaultRobot.y = 0;
//        defaultRobot.course = 0;
//        defaultRobot.distance = 0;

        ProtectedRobot protectedRobot = new ProtectedRobot();
//        protectedRobot.x = 0;
//        protectedRobot.y = 0;
//        protectedRobot.course = 0;
//        protectedRobot.distance = 0;

        PrivateRobot privateRobot = new PrivateRobot();
//        privateRobot.x = 0;

        PublicRobot publicRobot = new PublicRobot();
        publicRobot.x = 0;
        publicRobot.y = 0;
        publicRobot.course = 0;
        publicRobot.distance = 0;



    }



}

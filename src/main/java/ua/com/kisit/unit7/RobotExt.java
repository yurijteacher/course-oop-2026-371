package ua.com.kisit.unit7;

import java.util.ArrayList;
import java.util.List;

public class RobotExt extends Robot{

    private double totalDistance = 0;

    private double oldX = 0;
    private double oldY = 0;

    private List<RobotLine> robotLineList = new ArrayList<>();

    public double getOldX() {
        return oldX;
    }

    public void setOldX(double oldX) {
        this.oldX = oldX;
    }

    public double getOldY() {
        return oldY;
    }

    public void setOldY(double oldY) {
        this.oldY = oldY;
    }

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }

    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance, double totalDistance) {
        super(x, y, course, distance);
        this.totalDistance = totalDistance;
    }

    @Override
    public void forward(){

        oldX = super.getX();
        oldY = super.getY();

        super.forward();
        totalDistance += super.getDistance();

        RobotLine robotLine = new RobotLine(oldX, oldX, super.getX(), super.y);
        robotLineList.add(robotLine);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", RobotExt{" +
                "totalDistance=" + totalDistance +
                '}';
    }

    static void main() {


        RobotExt robotExt = new RobotExt();
        robotExt.setX(100);
        robotExt.setY(100);
        robotExt.setCourse(90);
        robotExt.setDistance(1500);
        robotExt.forward();


        System.out.println(robotExt);

        RobotExt robotExt1 = new RobotExt(0,0,0,0,0);
        robotExt1.setCourse(90);
        robotExt1.setDistance(100);

        robotExt1.forward();

        System.out.println(robotExt1);

        robotExt1.setCourse(45);
        robotExt1.setDistance(100);

        robotExt1.forward();
        System.out.println(robotExt1);

        robotExt1.setCourse(180);
        robotExt1.setDistance(100);

        robotExt1.forward();
        System.out.println(robotExt1);

        robotExt1.y = 100;
        System.out.println(robotExt1);


        for(RobotLine el : robotExt1.robotLineList){
            System.out.println(el);
        }



    }


}

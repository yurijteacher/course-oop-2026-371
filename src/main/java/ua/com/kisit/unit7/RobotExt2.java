package ua.com.kisit.unit7;

public class RobotExt2 extends RobotExt{

    private String name = "Model T1000";

    @Override
    public String toString() {
        return "RobotExt2{" +
                super.toString() +
                super.getRobotLineList() +
                ", name='" + name + '\'' +
                '}';
    }

    static void main() {
        RobotExt2 robotExt2 = new RobotExt2();
        System.out.println(robotExt2);
    }
}

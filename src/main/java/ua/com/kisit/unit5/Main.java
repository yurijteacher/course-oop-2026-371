package ua.com.kisit.unit5;

public class Main {

    static void main() {

        double c = MyProject.a + MyProject.b;

        System.out.println(c);

        MyProject.addAandB(MyProject.a, MyProject.b);

        double d  = MyProject.addAB(4,6);
        System.out.println(d);


    }

}

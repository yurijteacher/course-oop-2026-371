package ua.com.kisit.unit5;

public class MyProject {

    static double a = 3;
    static double b = 5;

    static public void addAandB(double a, double b){
        System.out.println(a+b);
    }

    static public double addAB(double a, double b){
        return a + b;
    }

    static public double subAB(double a, double b){
        return a-b;
    }


    static void main() {
        addAandB(MyProject.a, b);


        double c = addAB(4, 5);
        System.out.println(c);


    }



}

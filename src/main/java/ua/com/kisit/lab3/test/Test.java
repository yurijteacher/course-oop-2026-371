package ua.com.kisit.lab3.test;

public class Test {

    static void main() {

        MySingleton test1 = MySingleton.getInstance();
        test1.print();

        MySingleton test2 = MySingleton.getInstance();
        test2.print();

    }
}

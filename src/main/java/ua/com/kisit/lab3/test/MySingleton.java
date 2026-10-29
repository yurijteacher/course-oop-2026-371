package ua.com.kisit.lab3.test;

public class MySingleton {

    private static MySingleton instance;

    public static MySingleton getInstance(){

        if (instance == null){
            instance = new MySingleton();
        }

        return instance;
    }

    public void print(){
        System.out.println(this);
    }


}

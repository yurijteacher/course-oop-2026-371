package ua.com.kisit.lab3.test;

import java.text.Normalizer;
import java.util.Calendar;

public class MyClock {

    static void main() {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));

    }

}

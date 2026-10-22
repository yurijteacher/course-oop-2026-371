package ua.com.kisit.unit1;

import java.util.Arrays;

public class FirstProject1234 {

    static void main() {

        System.out.println("Hello Student!!");

        byte b  = 124;
        short a1 = 5;
        int a = 5;
        long l = 55555;
        float f = 4.55f;
        double d  = 5.66;
        boolean logic = true;
        char ch ='a';

        String text = "Text";

        char[] ch1 = text.toCharArray();

        //        {'H','e','l','l','o'};

        System.out.println(ch1);

        int[] array = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(array));

        int i3 = 0;
        i3 = i3 +1;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        i3=0;
        while (i3<10){
            System.out.println(i3);
            i3++;
        }

        int i= 0;
        for (;i < 10;) {
            System.out.println(i);
            i++;
        }

//        i= 0;
//        for (;;) {
//            System.out.println(i);
//            i++;
//        }

        /*
        v.1
        author: Lozovyk
         */

        i=0;

        do {
            System.out.println(i);
            i++;
        } while (i<10);

        i=0;
        if(i>1){
            System.out.println("F");
        } else {
            System.out.println("M");
        }

        String operation = "div";

        int a11 = 3;
        int a12 = 5;

        switch (operation){
            case ("mul"):
                System.out.println(a11*a12);
                 break;
            case ("div"):
                System.out.println(a11/a12);
                 break;
        }

        int a2 = 0;
        for(int i2=0; i2<10;i2++) {
            if (a2 < 5) {
                System.out.println(a2);
                a2++;
            } else {
                break;
            }
        }








    }

}

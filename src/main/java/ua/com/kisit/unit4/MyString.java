package ua.com.kisit.unit4;

import java.util.Arrays;
import java.util.Locale;

public class MyString {

    static void main() {

        String text = "Hello";
        System.out.println(text.hashCode() + ": " + text);

        text = text + ", Student!";
        System.out.println(text.hashCode() + ": " + text);

        String text1 = "Hello";
        String text2 = "Hello";

        System.out.println(text1.hashCode() == text2.hashCode());

        String text3 = new String("Hello");
        System.out.println(text3.hashCode() + ": " + text3);

        System.out.println(text1.hashCode() == text3.hashCode());

        System.out.println(text1 == text3); // false - equals

        System.out.println(text1.equals(text3));

        char[] arrays = text1.toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        String text4= new String(arrays);
        System.out.println(text4);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode() + ": " + sb);
        sb=sb.append(", Student!");
        System.out.println(sb.hashCode());

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer.hashCode()+": " + stringBuffer);
        stringBuffer = stringBuffer.append(", Student!!");
        System.out.println(stringBuffer.hashCode());

        String text5 = "\t \n \f I study Java with my teacher!! \n \r";
        System.out.println(text5.trim());

        System.out.println(text5.toUpperCase().trim());

        System.out.println(text5
                                .toLowerCase()
                                .trim());

        String text6 = "I study Java with my teacher!!";

        boolean logic = text6.startsWith("I study");
        System.out.println(logic);

        boolean logic1 = text6.endsWith("!!");
        System.out.println(logic1);

        String text7 = "I study.Java.with,my.teacher!!";

        String[] arr = text7.split("\\.|\\,| ");
        System.out.println(Arrays.toString(arr));

        System.out.println(text7.replace('s', '_'));
        System.out.println(text7.replace("!!", "!"));

        String text8 = new String(text7.toCharArray(), 2,10);
        System.out.println(text8);


    }

}

package ua.com.kisit.unit4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEX {

    static void main() {


        String text = "I study Java";

        String pattern = "[ IJa-z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("true");
        } else  {
            System.out.println("false");
        }

        System.out.print(m.matches() ? "true\n" : "false\n");

        /*
        [abc]
        [^abc]
        [a-z]
        [A-Z]
        [0-9] | \d
        [^0-9] | \D
        [a-zA-Z0-9_] \w
        [^a-zA-Z0-9_] \W
        \b - границя слова
        \B не на границі слова
        \n - перехід на новий рядок
        \f - перехід на нову сторінку
        \r - переміщення каретки на початок рядка тексту
        \t - знак табуляції
        [\t\n\f\r] | \s
        \S

       [..]{n} - n-разів
       [..]+ може бути один або більше разів
       [..]*
       [..]{n,m} - від n по m
       [..]{n,}
       [..]? 1 раз або може бути відсутнє

         */

        String email = "vsdf123q4.asfas_jhasgjdhasA_Dsdf@kneu.edu.ua"; // []{2,}

        String pattern1 = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[a-zA-Z]{2,}";

        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(email);

        System.out.println(m1.matches() ? "true" : "false");

    }

}

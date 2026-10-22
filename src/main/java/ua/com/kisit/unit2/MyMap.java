package ua.com.kisit.unit2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    static void main() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "C++");
        map.put(2, "Java");
        map.put(3, "JavaScript");

        System.out.println(map.get(1));

        map.put(3,"C");

        for(Map.Entry<Integer,String> el : map.entrySet()){
            System.out.println(el.getKey() + " - " + el.getValue());
        }

        System.out.println(map);
    }

}

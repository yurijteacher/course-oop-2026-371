package ua.com.kisit.unit2;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    static void main() {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);

        System.out.println(treeSet);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add(5);
        treeSet2.add(2);
        treeSet2.add(8);
        treeSet2.add(9);

        System.out.println(treeSet2);

        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet);
        treeSet3.retainAll(treeSet2);
        System.out.println(treeSet3);
    }


}

package ua.com.kisit.unit2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static void main(String[] args) {
        System.out.println("!!!");

        System.out.println("Byte:" + Byte.MIN_VALUE);
        System.out.println("Byte:" + Byte.MAX_VALUE);

        System.out.println("Short:" + Short.MIN_VALUE);
        System.out.println("Short:" + Short.MAX_VALUE);

        System.out.println("Integer:" + Integer.MIN_VALUE);
        System.out.println("Integer:" + Integer.MAX_VALUE);

        System.out.println("Long:" + Long.MIN_VALUE);
        System.out.println("Long:" + Long.MAX_VALUE);

        System.out.println("Float:" + Float.MIN_VALUE);
        System.out.println("Float:" + Float.MAX_VALUE);

        System.out.println("Double:" + Double.MIN_VALUE);
        System.out.println("Double:" + Double.MAX_VALUE);

        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.MAX_RADIX);



        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1,2,3,4,5,6,};

        arr2[3] = 20;

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }

        Stream
                .of(arr2)
                .forEach(e-> System.out.println(e));

        int[][] arr3 = new int[3][3];

        arr3[0][0] = 1;
        arr3[0][1] = 1;
        arr3[0][2] = 3;

        arr3[1][0] = 1;
        arr3[1][1] = 1;
        arr3[1][2] = 3;

        arr3[2][0] = 3;
        arr3[2][1] = 2;
        arr3[2][2] = 1;

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + ", ");
            }
            System.out.println();
        }

        List arr4 = List.of(1,2,3,4);
        System.out.println(arr4);
        //arr4.add(5);
        // System.out.println(arr4);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list);

        list.set(1,1);
        System.out.println(list);
        list.add(1,1);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.set(1,2);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        list.add(2345);
        list.add(2);
        list.add(2);
        System.out.println(list.get(0));


        list.stream().forEach(e-> System.out.print(e + ", "));

        Users user1 = new Users();
        user1.setId(1L);
        user1.setFirstName("Vasya");
        user1.setLastName("Pypkin");
        user1.setAge(25);


        Users user2 = new Users(2L, "Iva", "Pypkina", 18);
        Users user3 = new Users(3L, "Ivanna", "Pypkiny", 20);
        Users user4 = new Users(4L, "Ivanna", "Pypkiny", 20);

        List<Users> listUsers = new ArrayList<>();
        listUsers.add(user1);
        listUsers.add(user2);
        listUsers.add(user3);
        listUsers.add(user4);

        System.out.println("\n" + listUsers);

        Set<Users> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        System.out.println(set);

        System.out.println(listUsers);
        listUsers.remove(user4);
        System.out.println(listUsers);

        listUsers
                .stream()
                .sorted(Comparator.comparing(Users::getAge))
                .forEach(e-> System.out.println(e));

        int min_age = listUsers
                            .stream()
                            .min(Comparator.comparing(Users::getAge))
                            .get()
                            .getAge();

        listUsers.add(user3);

        System.out.println(listUsers);


        System.out.println(min_age);

        Set<Users> usersSet = listUsers.stream().collect(Collectors.toSet());
        List<Users> usersList2 = usersSet.stream().toList();

        for(Users user : usersList2){
            System.out.println(user);
        }

        System.out.println(usersSet);

        List<Users> userSorted = usersList2.stream().sorted(Comparator.comparing(Users::getId)).toList();
        System.out.println(userSorted);

        listUsers
                .parallelStream()
                .forEach(e-> System.out.println(e));

        List<String> userString = listUsers
                .stream()
                .map(e->e.getFirstName() + " " + e.getLastName() + ", Hello!")
                .toList();

        System.out.println(userString);


    }

}

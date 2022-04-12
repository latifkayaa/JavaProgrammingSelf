package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        int num=1;
        list.remove(num);
        System.out.println(list);

        Integer num1= 600;
        boolean r= list.remove(num1);
        System.out.println(list);
        System.out.println("r = " + r);
        list.clear();
        System.out.println(list);

        System.out.println(list.size());

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4


    }
}

package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        System.out.println(list);
        ArrayList<Integer> result = new ArrayList<>(); //{10, 20}

        for (Integer num : list) {
            if(result.contains(num)){
                continue;
            }
            result.add(num);
        }
        System.out.println(result);
    }
}

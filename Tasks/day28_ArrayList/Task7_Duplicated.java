package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7_Duplicated {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        int firstDup=0;

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)== list.get(i+1)){
                firstDup= list.get(i);
                break;
            }
        }
        System.out.println("firstDup = " + firstDup);

    }
}

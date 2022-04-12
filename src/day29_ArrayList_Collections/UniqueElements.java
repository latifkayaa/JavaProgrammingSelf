package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,7,7,7));

        for (int i = 0; i < nums.size(); i++) {
            int count=0;
            int num = nums.get(i);
            for (int j = 0; j < nums.size(); j++) {
                int each = nums.get(j);
                if(num==each){
                    count++;
                }

            }
            if(count==1){
                System.out.println("First unique element is: "+ num );
                break;
            }
        }

    }
}

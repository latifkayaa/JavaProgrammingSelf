package day23_Tasks;

import java.util.Locale;

public class Task16_PrintName {
    public static void main(String[] args) {
        //16.  write a method that can print out the full name of a person in regular format
        //     ex:    fullName("cYdEo", "SCHOOL");
        //     output:"Cydeo School"
        correctWayPrint("ahMEt HAKan");

    }

    public static void correctWayPrint(String str){
        str = str.toLowerCase();
        str = str.substring(0,1).toUpperCase() +
                str.substring(1, str.indexOf(" ")+1) +
                str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2 ).toUpperCase()+
                str.substring((str.indexOf(" ")+2));

        System.out.println("str = " + str);
    }
}

package methodsPractice;

import java.util.Scanner;

public class countLettersReplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String result="";

        for(int i=0; i<str.length(); i++){
            int count=0;
            String ch = str.substring (i,i+1);
            for(int j=0; j<str.length(); j++){
                String each = str.substring(j,j+1);
                if(ch.equals(each)){
                    count++;
                }
            }
            if(result.contains(ch)){
                continue;
            }
            result += count+ ch+"";
        }

return result;
    }
}

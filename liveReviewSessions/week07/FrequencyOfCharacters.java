package week07;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);

            int count=0;

            for (int j = 0; j <str.length(); j++) {

                if (ch == str.charAt(j)){
                    count++;
                }

            }

            if (result.contains(""+ch)){
                continue;
            }
            result +=ch;
            result+=count;
        }
        System.out.println(result);







    }
}

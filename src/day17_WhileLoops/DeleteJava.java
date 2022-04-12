package day17_WhileLoops;

public class DeleteJava {
    public static void main(String[] args) {
        String str= "Java Java Java Phyton";
        int frequency=0;
        for (int i = 0; i < str.length()-4; i++) {
            if(str.substring(i,i+4).equalsIgnoreCase("java")){
                frequency++;
            }

        }
        System.out.println("frequency = " + frequency);
        while((str.contains("Java"))){
            str = str.replaceFirst("Java", "");        }

        str= str.trim();
        System.out.println("New str is: " + str);
    }
}

package week06;

public class OddNumber {
    public static void main(String[] args) {
        for (int i = 3; i<=130 ; i++) {
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        int count =0;
        for (int i = 5; i <=50 ; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);


    }
}

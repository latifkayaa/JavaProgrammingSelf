package day23_Tasks;

public class Task1_OddNumbers {
    public static void main(String[] args) {
        //1. create a method that can print odd numbers between 1~100 in a same line saperated by space

        oddNums();

    }

    public static void oddNums(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }
    }
}

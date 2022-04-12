package day23_Tasks;

public class Task2_EvenNumbers {
    public static void main(String[] args) {

        evenNums();

    }

    public static void evenNums(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
}

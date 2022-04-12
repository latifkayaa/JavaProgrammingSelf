package day24_Method_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int maxNum = maxNum(15,-60);
        System.out.println("maxNum = " + maxNum);

        int doubled = 2*maxNum;
        System.out.println("doubled = " + doubled);



    }

    public static int maxNum(int number1, int number2){
        if(number1<number2){
            return number2;
        }
        else if(number2<number1){
            return number1;
        }
        else{
            return 0;
        }
    }
}

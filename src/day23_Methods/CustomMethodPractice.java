package day23_Methods;

public class CustomMethodPractice {
    public static void main(String[] args) {
        hello();
        System.out.println();
        hello2();
        System.out.println();
        evenNums();
    }

    public static void hello() {

        for (int i = 0; i < 5; i++) {
            System.out.print("Hello World! ");
        }
    }

    public static void hello2() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello Cydeo! ");
        }
    }

    public static void evenNums(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }

}

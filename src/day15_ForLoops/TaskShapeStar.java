package day15_ForLoops;

public class TaskShapeStar {

    public static void main(String[] args) {

        //Basic Loop for * shape
        for (int i = 0; i < 8; i++) {
            System.out.println("* * * * * *");
        }

        System.out.println("-----------");

        //Nested Loop for * shape
        for (int i = 0; i < 8 ; i++) {
            for (int k= 0; k<6; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Relational operator- loop for FINRA
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(" FINRA ");
            }
            else if (i%3==0){
                System.out.print(" FIN ");
            }
            else if (i%5==0){
                System.out.print(" RA ");
            }
            else{
                System.out.print(i + " ");
            }


        }
    }
}

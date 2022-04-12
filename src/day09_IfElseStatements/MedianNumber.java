package day09_IfElseStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a= 20;
        int b= 50;
        int c= 30;

        boolean medianA = (a>b && a<c)|| (a>c && b>a);
        boolean medianB= (a>b && b>c) || (b>a && b<c);
        boolean medianC= !medianA && !medianB;

        if(medianA){
            System.out.println("a is the median number.");
        }
        if(medianB){
            System.out.println("b is the median number.");
        }

        if(medianC){
            System.out.println("c is the median number.");
        }






    }




}

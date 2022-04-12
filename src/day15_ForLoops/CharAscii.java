package day15_ForLoops;

public class CharAscii {
    public static void main(String[] args) {
       /* char x = 'a';
        System.out.println("x = " + x);*/

        for (char x= 'A'; x<='Z'; x++){
            System.out.print(x + " ");
        }

        System.out.println();

        for (char x= 'Z'; x>='A'; x--){
            System.out.print( x + " ");
        }
        System.out.println();

        for (char x= 'a'; x<='z'; x++){
            System.out.print( x + " ");
        }
        System.out.println();

        for (char x= 'z'; x>='a'; x--){
            System.out.print( x + " ");
        }

    }
}

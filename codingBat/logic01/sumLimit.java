package logic01;

public class sumLimit {
    public static void main(String[] args) {

    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        String str = String.valueOf(sum);
        String str2 = String.valueOf(a);
        int length1= str.length();
        int length2=str2.length();

        if(length1==length2){
            return sum;
        }
        else{
            return a;
        }


    }

}

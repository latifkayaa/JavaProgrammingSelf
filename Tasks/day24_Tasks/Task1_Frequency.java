package day24_Tasks;

public class Task1_Frequency {
    public static void main(String[] args) {
/*1.  create a method named frequencyOfWord that passes two parameters:
 string sentence and String word, then returns the frequency of word from the sentence
 Ex:sentence = "Java java java python python"
            word = "java";
          frequencyOfWord(sentence, word) ==>  3  */

        String str1 = "Java java java python python";
        int freq = frequencyOfWord(str1, "python");
        System.out.println("freq = " + freq);

    }

    public static int frequencyOfWord (String sentence , String word){
        int frequency =0;
        for (int i = 0; i <sentence.length()-5 ; i++) {
            if(sentence.substring(i,i+6).equalsIgnoreCase(word)){
                frequency++;
            }
        }

        return frequency;
    }


}

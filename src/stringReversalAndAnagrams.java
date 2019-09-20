import java.util.*;

public class stringReversalAndAnagrams {

    public static void main(String[] args){


        String phrase = "This phrase is reversed!";

        StringBuilder phraseOne = new StringBuilder();

        phraseOne.append(phrase);
        phraseOne = phraseOne.reverse();
        System.out.println(phraseOne);


        //fiddling with String Arrays
        String same = "feat";
        String word = "fate";

        String wordArr[] = word.split(" ");

        for (int i=0; i < wordArr.length; i++){
            System.out.println(wordArr[i]);
        }



       // char[] stringToCharArray = word.toCharArray();
        char[] stringArray = same.toCharArray();


        //System.out.println(stringToCharArray);

       // System.out.println(stringArray);
        //for (char output : stringToCharArray){
        //    System.out.println(output);
       ///\ }







    }

}

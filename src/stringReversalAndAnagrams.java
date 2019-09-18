import java.util.*;

public class stringReversalAndAnagrams {

    public static void main(String[] args){


        String phrase = "This phrase is reversed!";

        StringBuilder phraseOne = new StringBuilder();

        phraseOne.append(phrase);
        phraseOne = phraseOne.reverse();
        System.out.println(phraseOne);

    }

}

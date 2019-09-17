import java.util.*;
public class toStringAndToInteger {

    public static void main(String[] args){
        //Hacker rank Easy challenge #1
        //turn a string into an integer and vice versa

        int a = 50;
        String  b = "5000000";
            System.out.println(a + b);
            System.out.println(b + " is a String and gets appended to 5 million as 505000000");

        int c = Integer.parseInt(b);
            System.out.println(b + " is not a string anymore and is added as 5000050");
            System.out.println(c + a);


        String d = Integer.toString(a);
        System.out.println(a + " is now a string");
        System.out.println(d + b);
    }

}

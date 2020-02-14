import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class edabit_Java_warmup {

    public static String rockPaperSci(){

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int rand_Game = rand.nextInt(4);
    String playerOne = scan.next();


    String[] rPi = {"rock", "paper", "scissors"};
    int length = rPi.length;
    int randomNumber = (int)(Math.random() * length);

    //if(rPi[randomNumber] != playerOne)
        return rPi[randomNumber];
       
    }


public static void main(String args[]){

System.out.println(rockPaperSci());

}


    
}
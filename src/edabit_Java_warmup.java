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
    System.out.println("Choose Rock, Paper or Scissors: ");
    String playerOne = scan.next();


    String[] rPi = {"rock", "paper", "scissors"};
    int length = rPi.length;
    int randomNumber = (int)(Math.random() * length);

    if(rPi[randomNumber] == "rock" && playerOne == "scissors"){
        System.out.println("Computer Wins!");
    }else if(rPi[randomNumber] == "paper" && playerOne == "rock"){
        System.out.println("Computer Wins!");
    }else if(rPi[randomNumber] == "scissors" && playerOne == "paper"){
        System.out.println("Computer Wins!");
    }else if(playerOne == "rock" && rPi[randomNumber] == "scissors"){
        System.out.println("Player One Wins!");
    }else if(playerOne == "paper" && rPi[randomNumber] == "rock"){
        System.out.println("Player One Wins!");
    }else if(playerOne == "scissors" && rPi[randomNumber] == "paper"){
        System.out.println("Player One Wins!");
    }else if(playerOne == rPi[randomNumber]){
        System.out.println("TIE game");
    }
        return rPi[randomNumber];
       
    }


public static void main(String args[]){

System.out.println(rockPaperSci());

}


    
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class edabit_Java_warmup {

    public static String rockPaperSci(){

    
    String[] rPi = {"rock", "paper", "scissors"};
    int length = rPi.length;
    int randomNumber = (int)(Math.random() * length);
    String comChoice = rPi[randomNumber];
        
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int rand_Game = rand.nextInt(4);
    System.out.println("Choose Rock, Paper or Scissors: ");
    String playerOne = scan.next();
    String comp = comChoice;
    System.out.println("Comp choice: " + comp);


    
    if(rPi[randomNumber] == "rock" && playerOne == "scissors"){
        String comWin = "Computer Wins!";
        System.out.println("Computer Wins!");
        return comWin;
    }else if(rPi[randomNumber] == "paper" && playerOne == "rock"){
        String comWin = "Computer wins";
        System.out.println("Computer Wins!");
        return comWin;
    }else if(rPi[randomNumber] == "scissors" && playerOne == "paper"){
        String comWin = "Computer wins";
        System.out.println("Computer Wins!");
        return comWin;
    }else if(playerOne == "rock" && rPi[randomNumber] == "scissors"){
        String playerWin = "Player One Wins!";
        System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne == "paper" && rPi[randomNumber] == "rock"){
        String playerWin = "Player One Wins!";
        System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne == "scissors" && rPi[randomNumber] == "paper"){
        String playerWin = "Player One Wins!";
        System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne == rPi[randomNumber]){
        System.out.println("TIE game");
        return "TIE Game";
    };
       return "Player Choice: " + playerOne + ", Comp Choice: " + comp; 
    }


public static void main(String args[]){

System.out.println(rockPaperSci());

}


    
}
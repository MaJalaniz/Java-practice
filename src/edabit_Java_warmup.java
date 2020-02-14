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

    //int rand_Game = rand.nextInt(4);
    System.out.println("Choose Rock, Paper or Scissors: ");
    String playerOne = scan.next();
    String comp = comChoice;
    System.out.println("Comp choice: " + comp);


    
    if(rPi[randomNumber].contains("rock") && playerOne.contains("scissors") == true){
        String comWin = "Computer Wins!";
       // System.out.println("Computer Wins!");
        return comWin;
    }else if(rPi[randomNumber].contains("paper") && playerOne.contains("rock") == true){
        String comWin = "Computer wins";
       // System.out.println("Computer Wins!");
        return comWin;
    }else if(rPi[randomNumber].contains("scissors") && playerOne.contains("paper") == true){
        String comWin = "Computer wins";
        //System.out.println("Computer Wins!");
        return comWin;
    }else if(playerOne.contains("rock") && rPi[randomNumber].contains("scissors") == true){
        String playerWin = "Player One Wins!";
       // System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne.contains("paper") && rPi[randomNumber].contains("rock") == true){
        String playerWin = "Player One Wins!";
        //System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne.contains("scissors") && rPi[randomNumber].contains("paper") == true){
        String playerWin = "Player One Wins!";
       // System.out.println("Player One Wins!");
        return playerWin;
    }else if(playerOne == rPi[randomNumber] == true){
        //System.out.println("TIE game");
        return "TIE Game";
    }else{
       return "No"; 
    }
    }


public static void main(String args[]){

System.out.println(rockPaperSci());

}


    
}
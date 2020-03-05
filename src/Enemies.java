import java.util.ArrayList;
import java.util.HashMap;

public class Enemies {

    public static String getEnemy(){
        String[] enemy = {"Wolf", "Slime", "Bandit", "Bear", "Frog"};
        int length = enemy.length;
        int randomNumber = (int)(Math.random() * length);
        String comChoice = enemy[randomNumber];
        return comChoice;
    }
public static void main(String args[]){
    

    System.out.println("The enemies here are: " + getEnemy());

}


}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class edabit_Java_warmup {

    //Write a function that takes in two integers and a char and calculates them
    public static int basicCal(int one, char two, int three){
       System.out.println(one + " " + two + " "+ three);
       if(two == '+'){
           return one += three;
       }else if(two == '-'){
           return one -= three;
       }else if(two == '*'){
           return one *= three;
       }else if(two == '/'){
           return one /= three;
       }else{
           return 0;
       }
    }



public static void main(String args[]){

   
System.out.println(basicCal(7, '*', 2));

}


    
}
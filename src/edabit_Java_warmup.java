import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class edabit_Java_warmup {

  //Find the minimum and maximum of an array

  public static int maximum(int[] one){
      int max = 0;
      for(int i = 0; i < one.length; i++){
          //System.out.println(one[i] + " and max: " + max);
          if(one[i] > max){
             max = one[i];
             //System.out.println("This is the new Max: " + max);
          }
      }
      return max;
  }

  public static int minimum(int[] two){
       //Hard coded
      for(int a = 5; a < two.length; a--){
        System.out.println(two[a]);
        if(a == 0 || two[a] < 5){
            return two[a];
        }
      }
      return 0;
  }
    //Find both Min and Max
 public static String findBoth(int[] three){
     if(three.length >= 5){
         System.out.println("Min equals: " + minimum(three) + " and  Max equals: " + maximum(three));
         return "Min equals: " + minimum(three) + " and  Max equals: " + maximum(three);
     }
     return "0";
 } 
    
    



public static void main(String args[]){

    int[] exampleArr = {20, 10, 43, 67, 100, 3};
System.out.println(findBoth(exampleArr));

}


    
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class edabit_Java_warmup {

    //Write a method that multiplies all the values in an array by array size
    public static ArrayList<Integer> multiplication(int[] one){
        ArrayList<Integer> value = new ArrayList<Integer>();
        for(Integer three : one){
            value.add(three * one.length);
        }
        return value;
    }



public static void main(String args[]){

    int[] numbers = {2,4,6,8};
    int[] multiplyBy = {1,2,3,4};
    


//System.out.println(numbers); 
//System.out.println(multiplyBy);
System.out.println("Array values multiplied: " + multiplication(numbers));

}


    
}
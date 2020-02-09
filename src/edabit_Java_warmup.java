public class edabit_Java_warmup{

    public int lastElement(int[] one){
        int laste = one[1];
          for(int i = 0; i < one.length; i++){
              if(one[i] <= laste){
                  laste = one[2];
                  //System.out.println(laste);
              }
          }
          return laste;
      }

public static void main(String args[]){
    int[] myArray = new int[3];
    myArray[0] = 12;
    myArray[1] = 43;
    myArray[2] = 5;
   edabit_Java_warmup m = new edabit_Java_warmup();

//System.out.println(m.lastElement(myArray) + ": is the last item in this array");
//System.out.println("This is the new Array");
System.out.println(squared(5));
}

//Very Easy challenge

/*
//Whats wrong with this code?

public static int squaed(int b){
    return $a * $a
}
 */

public static int squared(int a){
    return a * a;
}





}
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

System.out.println(m.lastElement(myArray) + ": is the last item in this array");
System.out.println("This is the new Array");

}

//int[] myArray = new int[2];
 //edabit_Java_warmup m = new edabit_Java_warmup();


/*
//Medium Challenge
public static int fibo(int shell){
    if(shell < 0) {
        return shell;
    }else{
    return (fibo(shell - 1) + fibo(shell - 2)); 
    }
}
*/





}
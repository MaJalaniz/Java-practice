public class edabit_Java_warmup{




public static void main(String args[]){
 
System.out.println(summer(12));

}

 public static int evenly(int a, int b){
    if(a % b == 0){
        System.out.println("This divides evenly");
        return 1;
    }else{
        System.out.println("The answer is: " + a/b);
        return 0;
    }
 }

 public static int summer(int begin){
     if(begin < 1)
     return begin;
     //System.out.println(begin);
     return (begin) + summer(begin-1);
     }
     





}
class edabit_Java_warmup{
public static void main(String[] args){
System.out.println(empty("Sparrows"));
System.out.println();
}
/*
//Very Easy Challenges

public static int time(int minutes){
    return minutes * 60;
}
public static double time(double minutes){
    return minutes * 60;
}
public static int perimeter(int height, int width){
    return ((height * 2) + (width * 2));
}
public static double perimeter(double height, double width){
    return ((height * 2) + (width * 2));
}
public static int thirdSide(int sideOne, int sideTwo){
    if(sideOne < 0 || sideTwo < 0){
        System.out.println("A side cannot be less than Zero");
        return 0;
    }else{
        return ((sideOne + sideTwo) - 1);
    }
}
public static boolean lessEqualZero(int num){
    if(num <= 0){
        System.out.println("Less than or equal to Zero");
        return true;
    }else{
        System.out.println("Greater than Zero");
        return false;
    }
}

//Medium Challenge
public static int fibo(int shell){
    if(shell < 0) {
        return shell;
    }else{
    return (fibo(shell - 1) + fibo(shell - 2)); 
    }
}
*/

public static String empty(String word){
    if(word.isEmpty() == true){
        System.out.println("Nothing");
        return "Empty String";
    }else{
        System.out.println("Words are present.");
        return word;
    }
}



}
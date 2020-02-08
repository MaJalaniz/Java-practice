class edabit_Java_warmup{
public static void main(String[] args){
System.out.println(lessEqualZero(20));
System.out.println();
}
/*
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
*/

public static boolean lessEqualZero(int num){
    if(num <= 0){
        System.out.println("Less than or equal to Zero");
        return true;
    }else{
        System.out.println("Greater than Zero");
        return false;
    }
}
}
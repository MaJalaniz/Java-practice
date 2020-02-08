class edabit_Java_warmup{
public static void main(String[] args){
System.out.println(perimeter(2, 4));
System.out.println(perimeter(2.5, 4.5));
}
/*
public static int time(int minutes){
    return minutes * 60;
}
public static double time(double minutes){
    return minutes * 60;
}
*/

public static int perimeter(int height, int width){
    return ((height * 2) + (width * 2));
}
public static double perimeter(double height, double width){
    return ((height * 2) + (width * 2));

}




}
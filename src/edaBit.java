public class edaBit {
    public static void main(String[] args){
    System.out.println(Sum(5,4));
    System.out.println(firstElement(numbersArray));
    System.out.println(area(5,10));
    System.out.println(nextNum(5));
    System.out.println(edge(10,11));
    }
//====================================================================
    //return a sum of two numbers
private static int Sum(int one, int two) {
    return one + two;
}

//=====================================================================
    //Return the first element in an array
private static int[] numbersArray = new int[]{100,2,3,4,5,6,7,8,9,10};

private static int firstElement(int[] one){
    return one[0];
}

//=====================================================================

//Return the area of a triangle

private static int area(int base, int height){
    return (base * height)/2;
}

//======================================================================

private static int nextNum(int plusOne){
    return plusOne + 1;
}
//=======================================================================

private static int edge(int sideOne, int sideTwo){
    return (sideOne + sideTwo) - 1;
}
//=======================================================================

}

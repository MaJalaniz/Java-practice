public class edaBit {
    public static void main(String[] args){
  /*
    System.out.println(Sum(5,4));
    System.out.println(firstElement(numbersArray));
    System.out.println(area(5,10));
    System.out.println(nextNum(5));
    System.out.println(edge(10,11));
    System.out.println(hourToSeconds(5));
    System.out.println(remainder(6,3));
    System.out.println(equals(0));
   */
    System.out.println(farm(4,4,4));
    }
/*
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

    //Return an integer plus one
private static int nextNum(int plusOne){
    return plusOne + 1;
}
//=======================================================================
    // Return the maximum third side of the triangle
private static int edge(int sideOne, int sideTwo){
    return (sideOne + sideTwo) - 1;
}
//=======================================================================
        //Return the hours converted to seconds
private static int hourToSeconds(int hour){
    return ((hour * 60) * 60);
}

//=======================================================================

    //Return the remainder from two numbers
private static int remainder(int one, int two) {
    return one % two;
}

//=======================================================================
    //Return if the number is less than or equal to zero
private static boolean equals(int three){
   boolean optionOne = true;
   boolean optionTwo = false;

    if(three <= 0){
        return optionOne;
    } else{
        return optionTwo;
    }
}
*/
//=======================================================================
    //Return the Farm Problem or total legs on the farm

private static int farm(int one, int two, int three){
    int chicken = 2;
    int cow = 4;
    int pig = 4;

    return ((chicken * one) + (cow * two) + (pig * three));
}



//=======================================================================
}

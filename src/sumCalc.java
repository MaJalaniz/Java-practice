public class sumCalc {

                //Practicing Getters/Setters and Method Overloading

    public static void main(String[] arg) {
   // System.out.println(addition(5,6));
    System.out.println(addition(5.5,5.5));

    //System.out.println(subtraction(5,7));
    //System.out.println(multiply(5,8));
    //System.out.println(division(5,9));

    System.out.println(average(5,5,5,5));
    System.out.println(average(10, 5.5));
    System.out.println();

    sumCalc verb = new sumCalc();
    verb.setWords("eating food");
        System.out.println("What am I doing? : " + verb.getWords());

    }


    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int c, int d ){
        return c - d;
    }
    public static int multiply(int e, int f){
        return e * f;
    }
    public static int division(int g, int h){
        return g / h;
    }

    public static double addition(double i , double j){
        return i + j;
    }

    public static int average(int k, int l , int m, int n){
        return (k + l + m + n)/4;
    }

    public static double average (double o, double p){
        return (o + p)/2;

    }
     private String q;



    public void setWords(String q){
       this.q = q;

    }
    public String getWords(){
        return this.q;
    }


}

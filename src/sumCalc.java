public class sumCalc {

                //Practicing Getters/Setters and Method Overloading

    public static void main(String[] arg) {
    System.out.println(addition(5,6));
    System.out.println(addition(5.5,5.5));

    System.out.println(subtraction(5,7));
    System.out.println(multiply(5,8));
    System.out.println(division(5,9));

    System.out.println(average(5,5,5,5));
    System.out.println(average(10, 5.5));
    System.out.println();

    sumCalc verb = new sumCalc();
    verb.setWords("eating food");
        System.out.println("What am I doing? : " + verb.getWords());

    }


    private static int addition(int a, int b){
        return a + b;
    }
    private static int subtraction(int c, int d ){
        return c - d;
    }
    private static int multiply(int e, int f){
        return e * f;
    }
    private static int division(int g, int h){
        return g / h;
    }

    private static double addition(double i , double j){
        return i + j;
    }

    private static int average(int k, int l , int m, int n){
        return (k + l + m + n)/4;
    }

    private static double average (double o, double p){
        return (o + p)/2;

    }


     private String q;

    private void setWords(String q){
       this.q = q;

    }
    private String getWords(){
        return this.q;
    }


}

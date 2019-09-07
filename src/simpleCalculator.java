public class simpleCalculator {
    public static void main(String[] args){

    }


public double firstNumber;
public double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double one){
        this.firstNumber = one;
    }
    public void setSecondNumber(double two){
        this.secondNumber = two;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else{
            return firstNumber / secondNumber;
        }
    }

}

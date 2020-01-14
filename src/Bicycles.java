abstract class Bicycles{

    public static void main(String[] args){

    }
    String color;
    int gears;


    abstract double price();
public abstract String bikeMessage();

public Bicycles(String color, int gears){
    this.color = color;
    this.gears = gears;
}

public String getColor(){
    return color;
}
public int getGears(){
    return gears;
}






}
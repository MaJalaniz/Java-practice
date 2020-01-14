abstract class Shape {
public static void main(String[] args){

}
String color;

abstract double area();
public abstract String toString();


public Shape(String color){
    this.color = color;
}
public String getColor(){
    return color;
}

}
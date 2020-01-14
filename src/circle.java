public class circle extends Shape{

public static void main(String[] args){

}
double radius;

public circle(String color, double radius){
    super(color);
    this.radius = radius;
}
@Override
    double area(){
        return Math.PI * (radius * 2);
    }
 @Override
    public String toString(){
        return "Circle color is " + super.color +  
        "and area is : " + area(); 
    }

}
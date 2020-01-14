class rectangle extends Shape{

public static void main(String[] args){

}

double length;
double width;

public rectangle(int length, int width, String color){
    super(color);
    this.length = length;
    this.width = width;
}

@Override
double area(){
    return length * width;
}


@Override
public String toString(){
  return  "Circle color is " + super.color +  
                       " and area is : " + area(); 
}

}
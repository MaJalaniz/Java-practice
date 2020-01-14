class MountainBike extends Bicycles{

public static void main(String[] args){

}

String type;
public MountainBike(String color, int gears, String type){
    super(color, gears);
    this.type = type;
}

@Override
public double price(){
    return gears * 5;
}
@Override
public String bikeMessage(){
    return "This bike is a " + this.type + " bike which has "+ super.gears + " gears and costs " + "$" + price();
}



}
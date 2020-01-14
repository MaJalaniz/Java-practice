class RoadBike extends Bicycles{
    public static void main(String[] args){

    }

    String model;

   public RoadBike(String color, int gears, String model){
        super(color, gears);
        this.model = model;
    }

    @Override
    public double price(){
        return gears * 5;
    }
    @Override
    public String bikeMessage(){
        return "This bike is a " + this.model + " bike which has "+ super.gears + " gears and costs " + "$" + price();

    }
}
class BikeTest{

public static void main(String[] args){
    Bicycles b1 = new MountainBike("Dark green", 8, "Mountain");
    Bicycles b2 = new RoadBike("Cherry red", 3, "Roadmaster");

    System.out.println(b1.bikeMessage());
    System.out.println(b1.price());
    System.out.println(------------------------------------------------------);
    System.out.println(b2.bikeMessage());
    System.out.println(b2.price());
}


}
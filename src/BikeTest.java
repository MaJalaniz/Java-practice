class BikeTest{

public static void main(String[] args){
    Bicycles b1 = new MountainBike("Dark green", 8, "Mountain");
    Bicycles b2 = new RoadBike("Cherry red", 3, "Roadmaster");

    System.out.println(b1.bikeMessage());
    System.out.println(b1.price());
    System.out.println("This is the wall of text that is supposed to seperate the two different bikes from each other, so they don\'t touch");
    System.out.println(b2.bikeMessage());
    System.out.println(b2.price());
}


}
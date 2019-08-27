public class car {
    //a file car.java is created

    //              Access Modifiers
    //Public: is unrestricted access to the class.
    //Private: no other class can access this class.
    //Protected: allows classes in its package access its class.

    //local variables cannot be accessed outside that method
    //class allow us to create variables that can be saved and accessible anywhere this class / fields/members
    //general rule: go with Private when defining fields-Encapsulation-hiding from the public view/outside access

    private int door; //variables are a state of a car/components
    private int wheels ;
    private String model;
    private String engine;
    private String color;

    //creating a method will attach to all objects you create for that class
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("chevy") || validModel.equals("ford")) {
            this.model = model;
        } else{
            this.model = "unknown";
        }
    }
    public String getModel(){
        return this.model;
    }


}

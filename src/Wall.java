
public class Wall {
    public static void main(String[] args){

        bank user = new bank(124,500.00, "Joe","jojo@aol.com", 2101993);
        user.setAccountNumber(150);
        user.setName("Joseph");
        user.setEmail("jojostar@gmail.com");
        System.out.println("The user: "+ user.getName() + ", has " + "$" + user.getBalance() + " in his account.");
        
        
    }



}

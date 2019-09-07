public class bank {
    public static void main(String[] args){
        bank makAccount = new bank();
        makAccount.deposit(100.0);
        makAccount.withdraw(50.0);

        System.out.println(makAccount.balance);

        bank bobAccount = new bank(1234, 0.5, "Bob", "email@email.com", 123456789)
    }

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public bank(){
        this(1232,50.0,"default", "email.com", 123456);
        //this has to be first ^
        System.out.println("Empty Constructor");
        //these are default parameters, this is calling a constructor within a constructor/ not mandatory
    }
    public bank(int accountNumber, double balance, String name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(depositAmount + " amount " + this.balance);
    }
    public void withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println(this.balance);
        } else {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + " amount " + balance);
        }
    }
    //Getters
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    //Setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }




}

public class bank {
    public static void main(String[] args){
      

    }
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    bank(int accountNumber,double balance, String name, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

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
    public long getPhoneNumber(){
        return phoneNumber;
    }

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
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}

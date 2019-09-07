public class Person {
    public static void main(String[] args){
        System.out.println();
    }

    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setSecondName(String second){
        this.lastName = second;
    }
    public void setAge(int personAge){
        if(personAge < 100 && personAge > 0){
            this.age = 0;
        }else {
            this.age = personAge;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }else if (firstName.isEmpty()){
            return lastName;
        }else if(lastName.isEmpty()){
            return firstName;
        }else{
            return firstName + lastName;
        }
    }

}

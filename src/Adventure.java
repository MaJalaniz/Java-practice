import java.util.Scanner;

public class Adventure {



    public static void main(String args[]){

        Protagonist hero = new Protagonist("YourName", 2000);
        int damage = (int)(Math.random() * 20) + 1;
        Scanner scan = new Scanner(System.in);

        //GAME START
        
        System.out.println("What is your hero name?");
        String name = scan.next();
        hero.setHeroName(name);
        
       System.out.println("----------------------------------------" +
        "\n" +  "  Your Name is: " + hero.getHeroName() + "\t "
        + "\n" + "  Your Health: " + hero.getHealth() + "\t \t "
       + "\n" + "----------------------------------------" );
        
        System.out.println("This is your name yes?");
        String nameCheck = scan.next();

        if(nameCheck.contains("yes") == true){
            System.out.println("Hello " + hero.getHeroName() + ", let's get started!");
        }else{
            System.out.println("What's your name?");
            name = scan.next();
            hero.setHeroName(name);
        }
        System.out.println("Great, now let's begin");
        //set a Timer Using 
       
       //System.out.println(tom.getHealth() - damage);
       //tom.setHealth(tom.getHealth() - damage);
       
        
        //System.out.println(tom.restoreHealth(tom.getHealth()));
       



    }

}


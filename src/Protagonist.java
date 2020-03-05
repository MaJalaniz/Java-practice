public class Protagonist{

    private String heroName;
    private int health;
    private int magic;
     int potion;

    Protagonist(String heroName, int health){
        this.heroName = heroName;
        this.health = health;
    }
    public String getHeroName(){
        return this.heroName;
    }
    public void setHeroName(String heroName){
        this.heroName = heroName;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    

    public static int restoreHealth(int health){
        int potion = 50;
         return potion += health;
    }

    public static void main(String args[]){

    }
}
import java.util.ArrayList;
import java.util.*;

class Student {

    public static void main(String[] args){
        /*
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0,2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        num.add(12);

        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.get(3));
        System.out.println(num.contains(6));
        System.out.println(num.isEmpty());
        System.out.println(num.remove(4));
        System.out.println(num);
        */
        HashMap<String, String> pupils = new HashMap<>();
        pupils.put("Matthew","Alaniz");
        pupils.put("Johnny", "Reyes");
        pupils.put("Demi", "Ortega");
        pupils.put("Ami", "Tsuru");

        System.out.println(pupils);
        System.out.println(pupils.get("Matthew"));
        System.out.println(pupils.containsKey("Demi"));
        System.out.println(pupils.containsValue("Tsuru"));
        System.out.println(pupils.getOrDefault("Carter", "Smith"));
        System.out.println();
        System.out.println();


    }








}
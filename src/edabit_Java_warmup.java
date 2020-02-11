import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class edabit_Java_warmup {

public static void main(String args[]){
 
System.out.println();
HashMap<String, String> listNames = new HashMap<String, String>();
ArrayList<String> arrayNames = new ArrayList<String>();


listNames.put("A", "Wheeler");
listNames.put("B", "Tiamat");
listNames.put("C", "Sugimoto");

arrayNames.add(listNames.get("A"));
arrayNames.add(listNames.get("B"));
arrayNames.add(listNames.get("C"));

System.out.println("Map contents: " + listNames); 
System.out.println("Array contents: " + arrayNames);   
System.out.println();   
System.out.println();   

}

    
}
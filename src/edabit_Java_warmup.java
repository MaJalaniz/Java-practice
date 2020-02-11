import java.util.HashMap;
import java.util.Map;

public class edabit_Java_warmup {

public static void main(String args[]){
 
System.out.println();
HashMap<String, String> listNames = new HashMap<String, String>();

listNames.put("A", "Wheeler");
listNames.put("B", "Tiamat");
listNames.put("C", "Sugimoto");

System.out.println("Map contents: " + listNames); 
System.out.println((listNames.get("A")));   
System.out.println((listNames.get("B")));   
System.out.println((listNames.get("C")));   

}

    
}
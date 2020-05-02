package api;
import java.util.HashMap;
public class MapAPI {

    public static void main(String[] args) {
        HashMap<String, Integer> empID = new HashMap<String, Integer>(); // Created HashMap
        empID.put("Ferhan", 250); // added --> Key and values
        empID.put("Navid", 251);
        empID.put("Michael", 252);
        empID.put("Eashan", 253);
        empID.put("Kamrun", 254);
        System.out.println(empID.containsValue("jahidul")); // r

    }

}
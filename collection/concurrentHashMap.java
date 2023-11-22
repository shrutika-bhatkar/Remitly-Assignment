package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
    public static void main(String[] args) {
        
        Map<String, String> myMap =  new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        System.out.println("ConcurrentHashMap element: " + myMap);
    }
    
}

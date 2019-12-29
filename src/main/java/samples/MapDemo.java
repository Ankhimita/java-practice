package samples;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            if (key.equals("2")) {
                myMap.remove("1");
                myMap.put("4", "4");
//                myMap.put("5", "5");
            }
        }

        for(Map.Entry<String,String> entry : myMap.entrySet()) {
            System.out.println("Key=" + entry.getKey() + "  " + "Value=" + entry.getValue());
        }
    }
}

package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","kim-map");
        map.put("2","lee-map");
        map.put("3","park-map");

        /*
        1 : kim-map
        2 : lee-map
        3 : park-map
         */

        System.out.println(map.get("2"));

        map.put("2","choi");

        /*
        1 : kim-map
        2 : choi-map
        3 : park-map
         */

        System.out.println(map.get("2"));
    }
}

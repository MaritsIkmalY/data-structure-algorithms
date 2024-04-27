package misc.classes;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 20);
        map2 = map1;

        map1.put("value", 10);

        System.out.println(map1);
        System.out.println(map2);
    }
}

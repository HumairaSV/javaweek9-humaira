package java_week9_humaira;

import java.util.HashMap;
import java.util.Map;

/*
9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */
public class Program9 {

    public static void main(String[] args) {


        Map<String, Integer> people = new HashMap();

        people.put("Jay", 1);
        people.put("Aryan", 2);
        people.put("Vatsal", 3);
        people.put("Ayan", 4);
        people.put("Lisa", 5);
        people.put("Enola", 6);
        people.put("Aster", 7);
        people.put("Roma", 8);
        people.put("None", 9);


        for (Map.Entry<String,Integer> list:people.entrySet()) {
            System.out.println(list);
        }
    }
}

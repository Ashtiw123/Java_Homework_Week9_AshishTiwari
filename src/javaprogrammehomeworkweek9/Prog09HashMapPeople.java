package javaprogrammehomeworkweek9;
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Prog09HashMapPeople {
    public static void main(String[] args) {

        // create a new HashMap that stores String keys and Integer values
        Map<String, Integer> people = new HashMap<>();

        // add some entries to the HashMap
        people.put("Sanket", 28);
        people.put("Jaina", 35);
        people.put("Viral", 35);
        people.put("Sunita", 35);
        people.put("Bhavika", 40);

        // iterate over the values in the HashMap using a for-each loop
        System.out.println("People in the HashMap:");
        for (Map.Entry<String, Integer> people1 : people.entrySet()) {
            System.out.println(people1 + " " );
        }
    }
}



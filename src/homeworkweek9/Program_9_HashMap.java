package homeworkweek9;

import java.util.HashMap;

/*Create a HashMap object called people that will store String keys and Integer values: And use for each loop
 to iterate the value from Map.
 */
public class Program_9_HashMap {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        //add key and value (Name, Age)
        people.put("Ram", 50);
        people.put("Shyam", 45);
        people.put("Ghanshyam", 56);
        people.put("Dhyan", 4);
        people.put("John", 89);

        for (String i : people.keySet()) {
            System.out.println( i + "value: " + people.get(i));

        }
    }
}

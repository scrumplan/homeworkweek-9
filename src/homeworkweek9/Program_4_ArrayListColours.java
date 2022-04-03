package homeworkweek9;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to create a new array list, add some colours (string) and printout the
collection using for each loop.*/
public class Program_4_ArrayListColours {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Red");
        colour.add("Green");
        colour.add("Pink");
        colour.add("Orange");
        colour.add("Blue");
        colour.add("Black");
        colour.add("White");
        colour.add("Yellow");

        //Print the list
        for (String element : colour) {
            System.out.println(element);
        }

    }


}

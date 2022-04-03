package homeworkweek9;
/*Write a Java program to retrieve an element (at a specified index) from a given array list*/


import java.util.ArrayList;

public class Program_6_SpecifiedIndex {
    public static void main(String[] args) {


        //create a list and add some colour to the list
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Red");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Orange");
        colour.add("Green");
        colour.add("White");
        colour.add("Brown");

        // System.out.println(colour.get(3));

        //print the ArrayList
        System.out.println(colour);

        //Retrive the frist and third element
        String element = colour.get(0);
        System.out.println("First element: " + element);
        String element1 = colour.get(2);
        System.out.println("Third element: " + element1);

    }
}

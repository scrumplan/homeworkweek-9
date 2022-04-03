package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list using Iterator.*/
public class Program_5_ArrayIterator {
    public static void main(String[] args) {
        // create all elements
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);
        list.add("Sonali");
        list.add("Red");
        list.add("Prime");
        list.add("Tesla");
        list.add(40);
        //list.contains("you");

        //Iterator
        Iterator<Object> a = list.iterator();
        while (a.hasNext()) {

            // print all elements of the list
            System.out.println(a.next());
        }


    }
}

package homeworkweek9;
/*Write a Java program to test an array list is empty or not. Define array list with underground tube names*/

import java.util.ArrayList;

public class Program_7_EmptyList {
    public static void main(String[] args) {

        ArrayList<String> tubeNames = new ArrayList<>();
       // System.out.println("Is Arraylist Empty: " + tubeNames.isEmpty());
        tubeNames.add("Piccadilly Circus");
        tubeNames.add("Pimlico");
        tubeNames.add("Pinner");
        tubeNames.add("Plaistow");
        tubeNames.add("Poplar");
        tubeNames.add("Preston Road");

        //checking again for isEmpty
        System.out.println("Is ArrayList Empty: " + tubeNames.isEmpty());

        for(String name : tubeNames){
            System.out.println(name);
        }
    }

}

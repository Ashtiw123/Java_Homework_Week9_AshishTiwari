package javaprogrammehomeworkweek9;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Prog04NewArrayListColoursString {
    public static void main(String[] args) {
        // create a new ArrayList of strings
        ArrayList<String> colours = new ArrayList<>();

       // Add few colours to the list
        colours.add("Red");
        colours.add("White");
        colours.add("Yellow");
        colours.add("Blue");

        //Using for-each loop and print statement
        System.out.println("Colours in the ArrayList:");
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}

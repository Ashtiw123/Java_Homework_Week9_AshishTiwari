package javaprogrammehomeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/*
* Write a Java program to iterate through all elements in an array list using
  Iterator.
  *  * In this program, we create an ArrayList of strings called fruits.
 * We then add some fruits to the list using the add method.
 *Next, we create an iterator for the list using the iterator method.
 * This returns an object that implements the Iterator interface.
 *We then use a while loop to iterate through the list using the iterator.
 * The hasNext method returns true if there are more elements in the list to iterate over.
 * The next method returns the next element in the list.
 *Inside the loop, we print out each fruit using the println method.
 *When we run the program, it should output the following:
 *Copy code
 * apple
 * banana
 * orange
 * kiwi
 */
public class Prog05IterateThroughAllElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Orange");
        fruits.add("Kiwi");

        // creating Iterator for the list
        Iterator<String> iterator = fruits.iterator();
        //List using Iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruits);
        }
    }
}

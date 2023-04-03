package javaprogrammehomeworkweek9;

import java.util.ArrayList;

/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
In this program, we first create an ArrayList of integers and add some elements to it.
    * We then use the get() method to retrieve the element at index 2
    * (which in this case is the third element in the ArrayList, since ArrayList indexes start at 0).
    *Finally, we print the retrieved element to the console using System.out.println().
    *Note that if the specified index is out of bounds
    *(i.e., less than 0 or greater than or equal to the size of the ArrayList), the get() method
    *will throw an IndexOutOfBoundsException. So it's important to make sure the index you specify
    *is valid before calling get().
 */
public class Prog06RetrieveAnElementFromGivenArrayList {
    public static void main(String[] args) {
        //Create an ArrayList of Numbers
        ArrayList<Integer> List = new ArrayList<>();
        List.add(5);
        List.add(20);
        List.add(25);
        List.add(35);
        List.add(27);
        List.add(55);
        //get element at index 4
        int element = List.get(4);

        //Print retrieve element
        System.out.println("Element at Index 4 :" + element);

    }
}

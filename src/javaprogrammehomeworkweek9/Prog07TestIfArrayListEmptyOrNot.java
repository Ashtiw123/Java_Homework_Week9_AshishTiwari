package javaprogrammehomeworkweek9;
/*
7. Write a Java program to test if an array list is empty or not.
In this program, we first create a new ArrayList of strings and add some elements to it
using the add() method. We then use the isEmpty() method to test whether the ArrayList is
empty or not. If the ArrayList is empty, we print out a message saying so.
If it's not empty, we print out a message saying so.

Note that the isEmpty() method returns true if the ArrayList contains
no elements, and false otherwise.
 */
import java.util.ArrayList;

public class Prog07TestIfArrayListEmptyOrNot {

    public static void main (String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
        list.add("AB");
        list.add("AC");
        list.add("AD");
        list.add(" ");

        boolean empty = list.isEmpty();
         //check if array list is empty or not
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty");
            }else{
            System.out.println("The ArrayList is not empty");
        }
    }



}

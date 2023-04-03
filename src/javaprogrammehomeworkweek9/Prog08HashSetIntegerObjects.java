package javaprogrammehomeworkweek9;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
In this program, we first create a new HashSet of integers and add the
numbers 4, 7, and 8 to the set using the add() method.
We then use a for loop to iterate over the numbers between 1 and 10, and use
an if statement to check whether each number is in the set using the contains() method.
If the number is in the set, we print out a message saying so. If it's not in the set,
we print out a message saying so.
 */
public class Prog08HashSetIntegerObjects {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add some integers to the HashSet
        set.add(7);
        set.add(4);
        set.add(8);

        // print out which numbers between 1 and 10 are in the set
        System.out.println("Numbers in the set:");
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}

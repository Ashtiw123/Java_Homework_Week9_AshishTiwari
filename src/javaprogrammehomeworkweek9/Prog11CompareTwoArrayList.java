package javaprogrammehomeworkweek9;

import java.util.ArrayList;

/*
11. Declare following two arraylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Prog11CompareTwoArrayList {
    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("White");

        // Compare the two ArrayLists
        //  boolean isEqual = c1.equals(c2);

        // Print the result
        // if (isEqual) {
        //      System.out.println("c1 and c2 are equal");
        //  } else {
        //       System.out.println("c1 and c2 are not equal");
        //  }
        ArrayList<String> c3 = new ArrayList<>();
        for(String e :c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}

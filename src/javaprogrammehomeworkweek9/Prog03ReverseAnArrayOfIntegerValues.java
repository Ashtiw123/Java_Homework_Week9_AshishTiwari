package javaprogrammehomeworkweek9;

/*
* 3. Write a Java program to reverse an array of integer values.
In this program, we first create an array of integers and print the original array to the console.
We then use a for loop to reverse the array, by swapping the first and last elements,
then the second and second-to-last elements, and so on, until we reach the middle of the array.
Finally, we print the reversed array to the console.

Note that we use a temporary variable temp to store the value of one of the
elements during the swap, so that we don't lose any data.
 */


public class Prog03ReverseAnArrayOfIntegerValues {
    public static void main(String[] args) {

        // create an array of integers
        int[] array = {1, 2, 3, 4, 5};

        // print the original array
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // reverse the array
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        // print the reversed array
        System.out.println("\nReversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

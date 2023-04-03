package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    static char userAnswer;


    public static void main(String[] args) {
        do {
            Main obj = new Main();
            Scanner t = new Scanner(System.in);
            System.out.print("Enter first Number : ");
            obj.a = t.nextInt();
            //int a = t.nextInt();
            System.out.print("Enter second Number : ");
            obj.b = t.nextInt();
            //  int b = t.nextInt();
            System.out.print("Please enter one of the symbol +, -, /, * : ");
            obj.symbol = t.next().charAt(0);
            //char symbol = t.next().charAt(0);
            obj.calculateResult(obj.a, obj.b, obj.symbol);
            System.out.println("Would you like to do more calculation, please enter Y or N : ");
            userAnswer = t.next().toLowerCase().charAt(0);
        }
        while (userAnswer == 'y');
    }
}



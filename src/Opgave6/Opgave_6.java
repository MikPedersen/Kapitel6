package Opgave6;
/*
(Display patterns) Write a method to display a pattern as follows:
1
12
123
...
 n n-1 ... 321
 The method header is : public static void displayPattern(int n)
 */

import java.util.Scanner;
public class Opgave_6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    int userinput = input.nextInt();                    //takes userinput for number of rows

    displayPattern(userinput);                          //Sets the input into method and runs
    }
    public static void displayPattern(int n) {
        for (int raekke = 1; raekke <= n; raekke++) {   // Table body in a nested loop

            for (int i = 1; i <= raekke; i++)           // Prints numbers and spaces
                System.out.print(" " + i);

            System.out.println();
        }
        }
}


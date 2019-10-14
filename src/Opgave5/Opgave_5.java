package Opgave5;
/* (Sort 3 numbers) Write a method with the following header to display three numbers in decreases order:
public static void displaySortedNumbers(double num1, double num2, double num3)
Write a test program that prompts the user to display them in decreasing order.
 */
import java.util.Scanner;

public class Opgave_5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 double numbers, e.g 30,4");
        double num1 = input.nextDouble(), num2 = input.nextDouble(), num3= input.nextDouble();
        displaySortedNumbers(num1,num2,num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max, middle, min;
        if (num1 > num2 && num1 > num3) { max = num1;
            if (num2 > num3){ middle = num2; min = num3;}
            else { middle = num3; min = num2; }
        }
        else if (num2 > num1 && num2 > num3) { max = num2;
            if (num1 > num3){ middle = num1; min = num3; }
            else { middle = num3; min = num1; }
        }
        else { max = num3;
            if (num1 > num2){ middle = num1;min = num2; }
            else { middle = num2; min = num1; }
        }
        System.out.println(" Max number is " + max + " middle number is " + middle + " smallest numbers is " + min);
    }
}
package Opgave12;

public class Opgave_12 {
    public static void main(String[] args) {
    printNumbers(1, 100, 10);
    }
    public static void printNumbers(int num1, int num2, int numbersPerLine){
        while (num1 <= num2){               //table body uses the modulus to seperate lines
            System.out.print(num1 +" ");    // First and last number is taken from method
            num1++;                         // parameters.
            numbersPerLine++;
            if (numbersPerLine % 10 == 0){
                System.out.println();

            }
        }
    }
}

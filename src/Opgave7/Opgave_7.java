package Opgave7;
import java.util.Scanner;
public class Opgave_7 {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the investment return table");
        System.out.println("Enter invested amount ");                   //takes invested value
        double investmentAmount = userInput.nextDouble();
        System.out.println("Enter monthly interest rate in %");         //takes annual rate and calculates it
        double monthlyInterestRate = userInput.nextDouble() / 12;       // into monthly rate

        System.out.println("Years - Future value");
        for (int i = 0; i < 30; i++) {                                  //table body

            System.out.printf("%2d%15.2f\n", i + 1, futureInvestmentValue(investmentAmount,
                    monthlyInterestRate, i + 1));
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount* Math.pow(( 1 + monthlyInterestRate / 100), (years * 12));
    }
}

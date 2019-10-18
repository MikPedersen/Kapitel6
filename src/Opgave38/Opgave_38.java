package Opgave38;
/*
Generate random characters, Use the methods in RandomCharacter in Listing 6.10
to print 200 uppercase letters and then 200 single digits. Print 10 pr line
 */
public class Opgave_38 {
    public static void main(String[] args) {
        //The first loop prints 200 upper case characters listed 10 pr row
        for (int i = 1; i <= 200; i++) {
            System.out.printf("%-2c", getRandomUpperCaseLetter());
            if (i % 10 == 0)
                System.out.println();
        }
        //The second loop prints 200 digit characters listed 10 pr row
        System.out.println();
        for (int j = 1; j <= 200; j++) {
            System.out.printf("%-2c", getRandomDigitCharacter());
            if (j % 10 == 0)
                System.out.println();

        }
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}

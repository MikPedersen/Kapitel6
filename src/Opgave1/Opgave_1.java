package Opgave1;

public class Opgave_1 {
    public static void main(String[] args) {
        //Udskrift i 10x10 af de 100 første tal
        int count = 1;
        for(int i = 1; i <= 100; i++){
            System.out.printf("%-7d",getPentagonalNumber(i));
            if(count % 10 == 0) System.out.println();
            count++;
        }
    }
    //Pentagonal metode
    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1))/2;
    }
}


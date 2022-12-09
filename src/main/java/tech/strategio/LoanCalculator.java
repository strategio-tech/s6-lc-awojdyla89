package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * The method takes in a loan amount due and returns the remaining
     * balance after 3 consecutive monthly payments of 10% of the loan.
     * 
     * @param amount represents the original debt owed.
     * @return the remaining total of the loan.
     */
    static int getRemainingAmountIn3Months(int amount) {

        int timeframe = 3;
        int amt = amount;

        for (int i = 0; i < timeframe ; i++) {
            amt = amt - (int)(amt * .1);
        }
        return amt;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}

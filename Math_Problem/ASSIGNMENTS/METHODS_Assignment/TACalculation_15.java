package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

public class TACalculation_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENiter income : ");
        int totalIncome = sc.nextInt();
        System.out.println("Enter Saving : ");
        int totalSaving = sc.nextInt();
        int taxAmount = totalIncome;

        if (totalSaving >= 100000) {
            taxAmount = taxAmount - 100000;
        } else {
            taxAmount = taxAmount - totalSaving;
        }

        taxCalculator(taxAmount);
    }

    private static void taxCalculator(int taxAmount) {
        if (taxAmount <= 100000){
            System.out.println("Total tax is 0 ");
        }
        else if (taxAmount > 100000 && taxAmount < 200000){
            int tax =  taxAmount * 10/100;
            System.out.printf("tax is %d", tax);
        } else if (taxAmount > 200000 && taxAmount < 500000) {
            int tax = taxAmount * 20 / 100;
            System.out.printf("tax is %d", tax);
        } else if (taxAmount >= 500000) {
            int tax = taxAmount * 30 / 100;
            System.out.printf("tax is %d", tax);

        }

    }
}

import java.util.Scanner;


public class BankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03; 
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance >> ");
        balance = scanner.nextDouble();

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = scanner.nextInt();

        do{
            year++;
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n", year, INTEREST_RATE, balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = scanner.nextInt();
        } while (choice == 1);

        scanner.close();
    }
}
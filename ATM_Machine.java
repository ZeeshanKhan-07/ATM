package ATM;
import java.util.Scanner;

class ATM {
    float balance = 156000;
    int PIN = 7654;

    public void check_pin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your pin : ");
        int entered_pin = sc.nextInt();

        if (entered_pin == PIN) {
            menu();
        }

        else {
            System.out.println("Enter a valid pin ...");
        }
        sc.close();

    }

    public void menu() {

        System.out.println("Enter your choice : ");
        System.out.println("1. check A/C Balance :");
        System.out.println("2. Withdraw Money :");
        System.out.println("3. Deposit Money : ");
        System.out.println("4. Exit....");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        }

        else if (option == 2) {
            Withdraw_Money();
        }

        else if (option == 3) {
            Deposit_Money();
        }

        else if (option == 4) {
            Exit();
        }

        else {
            System.out.println("Enter a valid Choice : ");
        }
        sc.close();
    }

    public void checkBalance() {
        System.out.println("Your total Balance is : " + balance);
        menu();
    }

    public void Withdraw_Money() {
        System.out.println("Enter Amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance : ");
        }

        else {
            balance = balance - amount;
            System.out.println("Money Withdrawal Successful : ");
            menu();
        }
        sc.close();
    }

    public void Deposit_Money() {
        System.out.println("Enter Amount to Deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Successful :");
        System.out.println("Your total balance is " + balance);
        menu();
        sc.close();
    }

    public void Exit() {
        menu();
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.check_pin();

    }
}

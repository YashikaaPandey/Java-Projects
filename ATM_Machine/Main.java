//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class atm{
    float BALANCE;
    int PIN=7878;

    public void checkpin() {
        System.out.println("enter you pin:");
        Scanner scan = new Scanner(System.in);
        int enteredpin = scan.nextInt();
        if (enteredpin == PIN) {
            menu();
        }
        else{
            System.out.println("invalid pin");
            
        }

    }
    public void menu(){
        System.out.println("Enter you choice: ");
        System.out.println("1. Check Bank Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();

        if (opt == 1) {
            checkBalance();
        }
        else if (opt == 2) {
            withdrawMoney();
        }
        else if (opt == 3) {
            depositMoney();
        }
        else if (opt == 4) {
            return;
        }
        else{
            System.out.println("invalid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance  :" + BALANCE);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        if (amount > BALANCE) {
            System.out.println("Insufficient Balance");
        }
        else{
            BALANCE -= amount;
            System.out.println("Withdraw successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter amount to deposit");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        BALANCE += amount;
        System.out.println("Deposit successful");
        menu();
    }
}
public class Main {
    public static void main(String[] args) {
           atm obj = new atm();
           obj.checkpin();
    }
}
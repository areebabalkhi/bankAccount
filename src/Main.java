import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("John Smith", 1000);
        BankAccount accountTwo = new BankAccount("Jane Smith", 1000);
        Scanner scan = new Scanner(System.in);
        System.out.println("Amount to withdraw from first account: (number only (decimals ok), must be less than or equal to 1000)");
        double withdraw = scan.nextDouble();
        System.out.println("Amount to deposit into second account: (number only (decimals ok))");
        double deposit = scan.nextDouble();
        accountOne.withdraw(withdraw);
        accountTwo.deposit(deposit);
        System.out.println(accountOne.returnAccountName() + "'s account has: $" + accountOne.returnBalance());
        System.out.println(accountTwo.returnAccountName() + "'s account has: $" + accountTwo.returnBalance());
        accountOne.deposit(400);
        System.out.println(accountOne.returnAccountName() + "'s account has: $" + accountOne.returnBalance());
        System.out.println(accountTwo.returnAccountName() + "'s account has: $" + accountTwo.returnBalance());
    }
}

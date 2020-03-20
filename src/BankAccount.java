public class BankAccount {
    private String accountName;
    private double balance;
    public BankAccount(String name, double initialBalance) {
        accountName = name;
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Can't have negative balance; balance set to $0.00");
        }
    }

    public void withdraw(double moneyToWithdraw) {
        if (balance >= moneyToWithdraw) {
            balance -= moneyToWithdraw;
        } else {
            System.out.println("Not enough money in bank!");
        }
    }

    public void deposit(double moneyToDeposit) {
        balance += moneyToDeposit;
    }

    public double returnBalance() {
        return balance;
    }

    public String returnAccountName() {
        return accountName;
    }

    public void setAccountName(String newAccountName) {
        accountName = newAccountName;
    }
}

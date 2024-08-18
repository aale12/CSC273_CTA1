package CSC273.CSC273_CTA1;

public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double value) {
        if (value > getBalance()) {
            double negativeBalance = getBalance() - (value + 30.00);
            setBalance(negativeBalance);
            System.out.println("You have overdrafted! New balance after $30 overdraft fee is " + this.getBalance());
        } else {
            withdraw(value);
        }
    }

    public String displayAccount() {
        return accountSummary() + "\nInterest Rate: " + (interestRate * 100) + "%";

    }
}

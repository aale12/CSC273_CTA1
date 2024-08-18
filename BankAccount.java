package CSC273.CSC273_CTA1;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("You have added $" + value + " to your balance.\nBalance is now $" + this.balance);
    }

    public void withdraw(double value) {
        this.balance -= value;
        System.out.println("You have withdrawn $ " + value + " from your balance.\nBalance is now $" + this.balance);
    }

    public String accountSummary() {
        return "BankAccount [firstName=" + firstName + ", lastName=" + lastName + ", accountID=" + accountID
                + ", balance=" + balance + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

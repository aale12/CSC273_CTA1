package CSC273.CSC273_CTA1;

public class TestAccount {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anthony", "Le", 1, 100.00);
        bankAccount.deposit(50);
        bankAccount.withdraw(75);
        System.out.println(bankAccount.accountSummary());
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("Anthony", "Le", 1, 125.00, 0.04);
        checkingAccount.deposit(75);
        checkingAccount.processWithdrawal(500);
        System.out.println("\nChecking Account information:");
        System.out.println(checkingAccount.displayAccount());
    }
}

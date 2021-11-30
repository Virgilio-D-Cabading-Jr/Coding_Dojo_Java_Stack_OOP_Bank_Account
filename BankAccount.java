//  /////////////////////////////////////////////////////////////
//  BANK ACCOUNT CLASS
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 2030
//  /////////////////////////////////////////////////////////////

public class BankAccount {
    //  //// MEMBER VARIABLES ///////////////////////////////////
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static int numTotalBankAccounts = 0;
    private static double totalAccountBalance = 0;

    //  //// CONSTRUCTORS ///////////////////////////////////////
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        BankAccount.numTotalBankAccounts++;
        this.accountNumber = 100000000 - (BankAccount.numTotalBankAccounts*7);
    }

    //  //// SET METHODS ////////////////////////////////////////

    public boolean depositChecking(double deposit) {
        if (deposit < 0) {
            return false;
        } 
        this.checkingBalance += deposit;
        BankAccount.totalAccountBalance += deposit;
        return true;
    }

    public boolean depositSavings(double deposit) {
        if (deposit < 0) {
            return false;
        }
        this.savingsBalance += deposit;
        BankAccount.totalAccountBalance += deposit;
        return true;
    }

    public boolean withdrawChecking(double withdrawal) {
        if (withdrawal < 0) {                                       // Cannot withdraw a negative number
            return false;
        } else if (withdrawal > this.checkingBalance) {             // Cannot withdraw if insufficient balance
            return false;
        }
        this.checkingBalance -= withdrawal;
        BankAccount.totalAccountBalance -= withdrawal;
        return true;
    }

    public boolean withdrawSavings(double withdrawal) {
        if (withdrawal < 0) {                                       // Cannot withdraw a negative number
            return false;
        } else if (withdrawal > this.savingsBalance) {             // Cannot withdraw if insufficient balance
            return false;
        }
        this.savingsBalance -= withdrawal;
        BankAccount.totalAccountBalance -= withdrawal;
        return true;
    }



    //  //// GET METHODS ////////////////////////////////////////

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getNumTotalBankAccounts() {
        return BankAccount.numTotalBankAccounts;
    }

    public static double getTotalBankAccountBalance() {
        return BankAccount.totalAccountBalance;
    }

    //  //// SHOW METHODS ///////////////////////////////////////

    public void display() {
        System.out.printf("---- Bank Account Num: %d ------------\n", this.getAccountNumber());
        System.out.printf("Checking Balance: $%.2f || Savings Balance: $%.2f\n", this.getCheckingBalance(), this.getSavingsBalance());
    }
}

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

    //  //// GET METHODS ////////////////////////////////////////

    public static int getNumTotalBankAccounts() {
        return BankAccount.numTotalBankAccounts;
    }

    public static double getTotalBankAccountBalance() {
        return BankAccount.totalAccountBalance;
    }

    //  //// SHOW METHODS ///////////////////////////////////////

    public void display() {
        System.out.printf("---- Bank Account Num: %d ------------\n", this.accountNumber);
        System.out.printf("Checking Balance: $%.2f || Savings Balance: $%.2f\n", this.checkingBalance, this.savingsBalance);
    }
}

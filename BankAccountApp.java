import java.util.ArrayList;                                         // Import ArrayLists

//  /////////////////////////////////////////////////////////////
//  BANK ACCOUNT APP
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 2030
//  /////////////////////////////////////////////////////////////

/**
 * BankAccountApp
 */
public class BankAccountApp {
    // //// MAIN EXECUTABLE SECTION /////////////////////////////
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("BANK ACCOUNT APPLICATION\n");

        System.out.println("*****************************************************");
        System.out.println("Creat 5 Bank Accounts");
        ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
        bankAccountList.add(new BankAccount());
        bankAccountList.add(new BankAccount());
        bankAccountList.add(new BankAccount());
        bankAccountList.add(new BankAccount());
        bankAccountList.add(new BankAccount());

        printBankAccountList(bankAccountList);
    }
    
    public static void printBankAccountList(ArrayList<BankAccount> bankAccountList) {
        System.out.println("==== Displaying all bank accounts ========");
        for (BankAccount bankAccount : bankAccountList) {
            bankAccount.display();
        }
        System.out.println("Total Number of bank accounts: " + BankAccount.getNumTotalBankAccounts());
        System.out.printf("Total Bank Account Balance: $%.2f\n", BankAccount.getTotalBankAccountBalance());
    }
    
}
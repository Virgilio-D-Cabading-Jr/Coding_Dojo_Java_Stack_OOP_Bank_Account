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
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Depositing 1.11 in checking account 1: " + bankAccountList.get(0).depositChecking(1.11));
        System.out.println("Depositing 2.22 in savings account 1: " + bankAccountList.get(0).depositSavings(2.22));
        System.out.println("Depositing 3.33 in checking account 2: " + bankAccountList.get(1).depositChecking(3.33));
        System.out.println("Depositing 4.44 in savings account 2: " + bankAccountList.get(1).depositSavings(4.44));
        System.out.println("Depositing 5.55 in checking account 3: " + bankAccountList.get(2).depositChecking(5.55));
        System.out.println("Depositing 6.66 in savings account 3: " + bankAccountList.get(2).depositSavings(6.66));
        System.out.println("Depositing 7.77 in checking account 4: " + bankAccountList.get(3).depositChecking(7.77));
        System.out.println("Depositing 8.88 in savings account 4: " + bankAccountList.get(3).depositSavings(8.88));
        System.out.println("Depositing 9.99 in checking account 5: " + bankAccountList.get(4).depositChecking(9.99));
        System.out.println("Depositing -1.11 in savings account 5: " + bankAccountList.get(4).depositSavings(-1.11));
        System.out.println("");
        printBankAccountList(bankAccountList);
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Depositing 100 in checking account 1: " + bankAccountList.get(0).depositChecking(100));
        System.out.println("Depositing 100 in savings account 1: " + bankAccountList.get(0).depositSavings(100));
        System.out.println("Depositing -100 in checking account 2: " + bankAccountList.get(1).depositChecking(-100));
        System.out.println("Depositing -100 in savings account 2: " + bankAccountList.get(1).depositSavings(-100));
        System.out.println("Depositing 1000 in checking account 3: " + bankAccountList.get(2).depositChecking(1000));
        System.out.println("Depositing 1000 in savings account 3: " + bankAccountList.get(2).depositSavings(1000));
        System.out.println("Depositing 10000 in checking account 4: " + bankAccountList.get(3).depositChecking(10000));
        System.out.println("Depositing 10000 in savings account 4: " + bankAccountList.get(3).depositSavings(10000));
        System.out.println("Depositing 100000 in checking account 5: " + bankAccountList.get(4).depositChecking(100000));
        System.out.println("Depositing 100000 in savings account 5: " + bankAccountList.get(4).depositSavings(10000));
        System.out.println("");
        printBankAccountList(bankAccountList);
        System.out.println("");
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
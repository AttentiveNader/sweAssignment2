package pp3;


/**
 * @author Nader Atef
 * @version 1.0.0.1
 */

public class Account {
    protected int balance;
    protected int accountNumber;

    public static int numberOfAccounts = 0;

    /**
     * default constructor
     */
    public Account() {
        Account.numberOfAccounts += 1;
        this.balance = 0;
        this.accountNumber = Account.numberOfAccounts;
    }
    /**
     * parametrized constructor
     * @param balance
     */
    public Account(int balance) {
        Account.numberOfAccounts += 1;
        this.balance = balance;
        this.accountNumber = numberOfAccounts;
    }

    //setters and getters functions

    /**
     * setter
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * getter
     * @return
     */
    public int getBalance() {
        return balance;
    }

    /**
     * setter
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }


    /**
     * Overriding the method toString
     * @return content of the class as a string
     */
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }

    /**
     *
     * @param howmuch
     * @return
     */
    public boolean withdraw(int howmuch) {
        if (howmuch <= balance) {
            balance -= howmuch;
            return true;
        } else {
            System.out.println("not enough balance");
            return false;
        }

    }

    public void deposit(int amount) {
        balance += amount;
    }

    public  static void  main(String[] args) {
        Account acc1 = new Account(20);
        SpecialAccount specialAccount = new SpecialAccount(20);
        System.out.println(acc1);
        System.out.println(specialAccount);
        acc1.deposit(100);
        specialAccount.withdraw(100);
        System.out.println(acc1);
        System.out.println(specialAccount);

    }

}

//child class from Account
class SpecialAccount extends Account {
    /**
     * default constructor
     */
    public SpecialAccount() {
        super();
    }
    /**
     * parameterized constructor
     * @param balance
     */
    public SpecialAccount(int balance) {
        super(balance);
    }


    /**
     * Overriding the method toString
     * @param howmuch
     * @return a bool that indicates whether the process was a success
     */
    @Override
    public boolean withdraw(int howmuch) {
        if ((balance - howmuch) >= -1000) {
            balance -= howmuch;
            return true;
        } else {
            System.out.println("balance can't be less than -1000");
            return false;
        }
    }
}

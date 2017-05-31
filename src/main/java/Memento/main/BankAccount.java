package Memento.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class BankAccount {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private Stack<BankAccountMemento> bankAccountHistory = new Stack<>();
    private int balance;
    private AccountType accountType;
    private double rateOfInterest;
    private double rateOfATMPayout;

    public BankAccount(AccountType accountType){
        balance = 0;
        setAccountType(accountType);
        LOGGER.info("New account created. Type: " + accountType.toString());
    }

    private void setAccountType(AccountType accountType) {
        this.accountType = accountType;
        switch(accountType){
            case STANDARD:
                setRates(0.2, 0.2);
                break;
            case STUDENT:
                setRates(0.1, 0);
                break;
            case BUSINESS:
                setRates(0.4, 0.3);
                break;
            case PENSIONARY:
                setRates(0.3, 0.1);
                break;
        }
    }

    public void changeAccountType(AccountType accountType){
        setAccountType(accountType);
        LOGGER.info("Account type changed. Type: " + accountType.toString().toString());
    }

    private void setRates(double rateOfInterest, double rateOfATMPayout){
        this.rateOfInterest = rateOfInterest;
        this.rateOfATMPayout = rateOfATMPayout;
    }

    public void depositMoney(int moneyToDeposit){
        balance += moneyToDeposit;
        LOGGER.info("New balance: " + balance);
    }

    public void withdrawMoney(int moneyToWithdraw){
        double accountWithdrawal =  moneyToWithdraw + (moneyToWithdraw*rateOfATMPayout);
        balance -= accountWithdrawal;
        LOGGER.info("New balance: " + balance);
    }

    public void monthLater(){
        balance = (int) (balance+(balance*rateOfInterest));
        LOGGER.info("New balance after month: " + balance);
        BankAccountMemento memento = getMemento();
        bankAccountHistory.push(memento);
        LOGGER.info("Bank account history memento added.");
    }

    BankAccountMemento getMemento(){
        BankAccountMemento memento = new BankAccountMemento();
        memento.setBalance(balance);
        memento.setAccountType(accountType);
        return memento;
    }

    public void getLogFromBankAccountMemento(){
        BankAccountMemento memento = bankAccountHistory.lastElement();
        LOGGER.info("Memento - Balance:" + memento.getBalance());
        LOGGER.info("Memento - Account Type:" + memento.getAccountType().toString());
    }

    public int getBalanceFromLastMemento(){
        BankAccountMemento memento = bankAccountHistory.lastElement();
        return (int) memento.getBalance();
    }

    public AccountType getAccountTypeFromLastMemento(){
        BankAccountMemento memento = bankAccountHistory.lastElement();
        return memento.getAccountType();
    }

    public void popLastMemento(){
        bankAccountHistory.pop();
    }

    private class BankAccountMemento implements BankAccountMementoInterface {

        private int balance;
        private AccountType accountType;

        @Override
        public double getBalance() {
            return balance;
        }

        @Override
        public void setBalance(double balance) {
            this.balance = (int) balance;
        }

        @Override
        public AccountType getAccountType() {
            return accountType;
        }

        @Override
        public void setAccountType(AccountType accountType) {
            this.accountType = accountType;
        }
    }

}

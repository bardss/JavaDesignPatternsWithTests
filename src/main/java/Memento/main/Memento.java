package Memento.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Memento {

    private static final Logger LOGGER = LoggerFactory.getLogger(Memento.class);

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(AccountType.STUDENT);
        myAccount.depositMoney(1000);
        myAccount.withdrawMoney(200);
        myAccount.monthLater();

        System.out.println("/n");
        myAccount.getLogFromBankAccountMemento();
        System.out.println("/n");

        myAccount.changeAccountType(AccountType.STANDARD);
        myAccount.depositMoney(1500);
        myAccount.withdrawMoney(500);
        myAccount.monthLater();

        System.out.println("/n");
        myAccount.getLogFromBankAccountMemento();
        System.out.println("/n");

        myAccount.changeAccountType(AccountType.BUSINESS);
        myAccount.depositMoney(800);
        myAccount.withdrawMoney(200);
        myAccount.monthLater();

        System.out.println("/n");
        myAccount.getLogFromBankAccountMemento();
        System.out.println("/n");

        myAccount.changeAccountType(AccountType.PENSIONARY);
        myAccount.depositMoney(500);
        myAccount.withdrawMoney(100);
        myAccount.monthLater();

        System.out.println("/n");
        myAccount.getLogFromBankAccountMemento();
        System.out.println("/n");
    }
}

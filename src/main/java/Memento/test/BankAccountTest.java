package Memento.test;

import Memento.main.AccountType;
import Memento.main.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @Test
    public void testMemento() {
        final BankAccount myAccount = new BankAccount(AccountType.STUDENT);
        myAccount.depositMoney(1000);
        myAccount.withdrawMoney(200);
        myAccount.monthLater();

        myAccount.changeAccountType(AccountType.STANDARD);
        myAccount.depositMoney(1500);
        myAccount.withdrawMoney(500);
        myAccount.monthLater();

        myAccount.changeAccountType(AccountType.BUSINESS);
        myAccount.depositMoney(800);
        myAccount.withdrawMoney(200);
        myAccount.monthLater();

        myAccount.changeAccountType(AccountType.PENSIONARY);
        myAccount.depositMoney(500);
        myAccount.withdrawMoney(100);
        myAccount.monthLater();

        assertEquals(5376, myAccount.getBalanceFromLastMemento());
        assertEquals(AccountType.PENSIONARY, myAccount.getAccountTypeFromLastMemento());
        myAccount.popLastMemento();

        assertEquals(3746, myAccount.getBalanceFromLastMemento());
        assertEquals(AccountType.BUSINESS, myAccount.getAccountTypeFromLastMemento());
        myAccount.popLastMemento();

        assertEquals(2136, myAccount.getBalanceFromLastMemento());
        assertEquals(AccountType.STANDARD, myAccount.getAccountTypeFromLastMemento());
        myAccount.popLastMemento();

        assertEquals(880, myAccount.getBalanceFromLastMemento());
        assertEquals(AccountType.STUDENT, myAccount.getAccountTypeFromLastMemento());
        myAccount.popLastMemento();
    }

}

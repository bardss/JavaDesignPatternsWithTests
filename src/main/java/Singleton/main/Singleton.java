package Singleton.main;

import Singleton.main.Countries.EuropeanCountry;
import Singleton.main.Countries.Poland;
import Singleton.main.Countries.Germany;
import Singleton.main.Countries.Italy;
import Singleton.main.Countries.Spain;

public class Singleton {

    public static void main(String[] args) {

        EuropeanCountry poland = new Poland();
        poland.donateMoney(2000);
        poland.earnMoney();
        EuropeanUnionBudget.budgetStatus();

        EuropeanCountry germany = new Germany();
        germany.donateMoney(5000);
        germany.earnMoney();
        EuropeanUnionBudget.budgetStatus();

        EuropeanCountry italy = new Italy();
        italy.donateMoney(1000);
        italy.earnMoney();
        EuropeanUnionBudget.budgetStatus();

        EuropeanCountry spain = new Spain();
        spain.donateMoney(2500);
        spain.earnMoney();
        EuropeanUnionBudget.budgetStatus();

    }

}

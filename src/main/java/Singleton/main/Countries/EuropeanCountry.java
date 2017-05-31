package Singleton.main.Countries;

import Singleton.main.EuropeanUnionBudget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EuropeanCountry {

    private static final Logger LOGGER = LoggerFactory.getLogger(EuropeanCountry.class);

    protected CountryType countryType = null;
    protected int budget = 0;
    protected EuropeanUnionBudget europeanUnionBudget;

    public void donateMoney(int moneySpent){
        LOGGER.info(countryType.toString() + " donated: " + moneySpent);
        europeanUnionBudget.donateMoney(moneySpent);
    }

    public void earnMoney(){
        int donation = europeanUnionBudget.getDonation(countryType);
        LOGGER.info(countryType.toString() + " earned: " + donation);
        budget += donation;
    }

    public EuropeanUnionBudget getCountryEUBudgetInstance(){
        return europeanUnionBudget;
    }

}

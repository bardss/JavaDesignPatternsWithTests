package Singleton.main;

import Singleton.main.Countries.CountryType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EuropeanUnionBudget {

    private static final Logger LOGGER = LoggerFactory.getLogger(EuropeanUnionBudget.class);

    private static EuropeanUnionBudget instance;
    private int budget = 0;

    public EuropeanUnionBudget(){
        budget = 1000000;
    }

    public static EuropeanUnionBudget getInstance(){
        if (instance == null){
            return instance = new EuropeanUnionBudget();
        }
        return instance;
    }

    public void donateMoney(int money){
        budget += money;
    }

    public int getDonation(CountryType countryType){
        int donation = 0;
        switch (countryType) {
        case POLAND:
            donation = 10000;
            break;
        case GERMANY:
            donation = 20000;
            break;
        case ITALY:
            donation = 50000;
            break;
        case SPAIN:
            donation = 30000;
            break;
        }
        budget -= donation;
        return donation;
    }

    public static int budgetStatus(){
        if (instance != null) {
            LOGGER.info("Budget Status: " + instance.budget);
            return instance.budget;
        }
        return 0;
    }
}

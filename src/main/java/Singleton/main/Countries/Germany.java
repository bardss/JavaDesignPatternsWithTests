package Singleton.main.Countries;

import Singleton.main.EuropeanUnionBudget;

public class Germany extends EuropeanCountry {

    public Germany (){
        countryType = CountryType.GERMANY;
        budget = 500000;
        europeanUnionBudget = EuropeanUnionBudget.getInstance();
    }

}
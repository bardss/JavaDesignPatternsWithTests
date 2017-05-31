package Singleton.main.Countries;

import Singleton.main.EuropeanUnionBudget;

public class Italy extends EuropeanCountry {

    public Italy (){
        countryType = CountryType.ITALY;
        budget = 100000;
        europeanUnionBudget = EuropeanUnionBudget.getInstance();
    }

}
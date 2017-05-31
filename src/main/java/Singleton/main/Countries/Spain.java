package Singleton.main.Countries;

import Singleton.main.EuropeanUnionBudget;

public class Spain extends EuropeanCountry {

    public Spain (){
        countryType = CountryType.SPAIN;
        budget = 200000;
        europeanUnionBudget = EuropeanUnionBudget.getInstance();
    }

}

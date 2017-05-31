package Singleton.main.Countries;

import Singleton.main.EuropeanUnionBudget;

public class Poland extends EuropeanCountry {

    public Poland (){
        countryType = CountryType.POLAND;
        budget = 100000;
        europeanUnionBudget = EuropeanUnionBudget.getInstance();
    }

}

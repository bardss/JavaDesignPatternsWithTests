package Singleton.test;

import Singleton.main.Countries.*;
import Singleton.main.EuropeanUnionBudget;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class EuropeanUnionBudgetTest {

    @Test
    public void testIfSameInstances() {
        EuropeanCountry poland = new Poland();
        EuropeanCountry germany = new Germany();
        EuropeanCountry italy = new Italy();
        EuropeanCountry spain = new Spain();

        EuropeanUnionBudget instance1 = poland.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance2 = germany.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance3 = italy.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance4 = spain.getCountryEUBudgetInstance();

        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance1, instance4);

        assertSame(instance2, instance3);
        assertSame(instance2, instance4);

        assertSame(instance3, instance4);
    }

    @Test
    public void testIfInstanceNotNull() {
        EuropeanCountry poland = new Poland();
        EuropeanCountry germany = new Germany();
        EuropeanCountry italy = new Italy();
        EuropeanCountry spain = new Spain();

        EuropeanUnionBudget instance1 = poland.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance2 = germany.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance3 = italy.getCountryEUBudgetInstance();
        EuropeanUnionBudget instance4 = spain.getCountryEUBudgetInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertNotNull(instance3);
        assertNotNull(instance4);
    }

}

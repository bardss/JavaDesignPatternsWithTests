package Prototype.main;

import Prototype.main.ExampleGoblins.*;
import Prototype.main.Factory.GoblinFactory;
import Prototype.main.Factory.GoblinFactoryImpl;
import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Farmer;
import Prototype.main.Prototypes.Mage;
import Prototype.main.Prototypes.Warrior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prototype {

    private static final Logger LOGGER = LoggerFactory.getLogger(Prototype.class);

    public static void main(String[] args) {
        GoblinFactory goblinFactory;
        Farmer farmer;
        Mage mage;
        Engineer engineer;
        Warrior warrior;

        goblinFactory = new GoblinFactoryImpl(new NormalWarrior(), new NormalMage(), new NormalEngineer(), new NormalFarmer());
        farmer = goblinFactory.createFarmer();
        mage = goblinFactory.createMage();
        engineer = goblinFactory.createEngineer();
        warrior = goblinFactory.createWarrior();
        LOGGER.info(farmer.getName());
        LOGGER.info(mage.getName());
        LOGGER.info(engineer.getName());
        LOGGER.info(warrior.getName());

        goblinFactory = new GoblinFactoryImpl(new EliteWarrior(), new EliteMage(), new EliteEngineer(), new EliteFarmer());
        farmer = goblinFactory.createFarmer();
        mage = goblinFactory.createMage();
        engineer = goblinFactory.createEngineer();
        warrior = goblinFactory.createWarrior();
        LOGGER.info(farmer.getName());
        LOGGER.info(mage.getName());
        LOGGER.info(engineer.getName());
        LOGGER.info(warrior.getName());


    }

}

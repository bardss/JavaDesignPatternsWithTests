package Prototype.main.Factory;

import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Farmer;
import Prototype.main.Prototypes.Mage;
import Prototype.main.Prototypes.Warrior;

public interface GoblinFactory {

    Warrior createWarrior();
    Mage createMage();
    Engineer createEngineer();
    Farmer createFarmer();

}

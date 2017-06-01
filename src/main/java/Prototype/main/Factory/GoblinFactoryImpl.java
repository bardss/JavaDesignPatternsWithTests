package Prototype.main.Factory;

import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Farmer;
import Prototype.main.Prototypes.Mage;
import Prototype.main.Prototypes.Warrior;

public class GoblinFactoryImpl implements GoblinFactory {

    private Warrior warrior;
    private Mage mage;
    private Engineer engineer;
    private Farmer farmer;

    public GoblinFactoryImpl(Warrior warrior, Mage mage, Engineer engineer, Farmer farmer){
        this.warrior = warrior;
        this.mage = mage;
        this.engineer = engineer;
        this.farmer = farmer;
    }

    @Override
    public Warrior createWarrior() {
        try {
            return warrior.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Mage createMage() {
        try {
            return mage.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Engineer createEngineer() {
        try {
            return engineer.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Farmer createFarmer() {
        try {
            return farmer.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

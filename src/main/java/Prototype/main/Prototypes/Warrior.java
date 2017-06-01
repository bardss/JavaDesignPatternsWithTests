package Prototype.main.Prototypes;

import Prototype.main.Factory.PrototypePattern;

public abstract class Warrior extends PrototypePattern {

    @Override
    public abstract Warrior clone() throws CloneNotSupportedException;

    public String getName() {
        return null;
    }

}

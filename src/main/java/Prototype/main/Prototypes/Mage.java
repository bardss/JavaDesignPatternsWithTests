package Prototype.main.Prototypes;

import Prototype.main.Factory.PrototypePattern;

public abstract class Mage extends PrototypePattern {

    @Override
    public abstract Mage clone() throws CloneNotSupportedException;

    public String getName() {
        return null;
    }

}

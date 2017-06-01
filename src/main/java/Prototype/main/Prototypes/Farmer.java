package Prototype.main.Prototypes;

import Prototype.main.Factory.PrototypePattern;

public abstract class Farmer extends PrototypePattern {

    @Override
    public abstract Farmer clone() throws CloneNotSupportedException;

    public String getName() {
        return null;
    }

}
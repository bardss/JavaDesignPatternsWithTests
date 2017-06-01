package Prototype.main.Prototypes;

import Prototype.main.Factory.PrototypePattern;

public abstract class Engineer extends PrototypePattern {

    @Override
    public abstract Engineer clone() throws CloneNotSupportedException;

    public String getName() {
        return null;
    }

}
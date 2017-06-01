package Prototype.main.Factory;

import Prototype.main.Prototype;

public abstract class PrototypePattern implements Cloneable {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

}

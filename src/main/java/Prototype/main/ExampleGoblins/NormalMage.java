package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Mage;

public class NormalMage extends Mage {

    public NormalMage(){};

    @Override
    public NormalMage clone() throws CloneNotSupportedException {
        return new NormalMage();
    }

    public String getName(){
        return "Normal Mage!";
    }
}

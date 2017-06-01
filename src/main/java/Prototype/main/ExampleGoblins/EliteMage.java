package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Mage;

public class EliteMage extends Mage {

    public EliteMage(){};

    @Override
    public EliteMage clone() throws CloneNotSupportedException {
        return new EliteMage();
    }

    public String getName(){
        return "Elite Mage!";
    }
}

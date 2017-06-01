package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Farmer;

public class NormalFarmer extends Farmer {

    public NormalFarmer(){};

    @Override
    public NormalFarmer clone() throws CloneNotSupportedException {
        return new NormalFarmer();
    }

    public String getName(){
        return "Normal Farmer!";
    }
}

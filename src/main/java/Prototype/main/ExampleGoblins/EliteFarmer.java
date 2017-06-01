package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Farmer;

public class EliteFarmer extends Farmer {

    public EliteFarmer(){};

    @Override
    public Farmer clone() throws CloneNotSupportedException {
        return new EliteFarmer();
    }

    public String getName(){
        return "Elite Farmer!";
    }
}

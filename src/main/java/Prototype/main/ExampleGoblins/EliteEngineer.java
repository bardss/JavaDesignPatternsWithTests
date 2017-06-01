package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Engineer;

public class EliteEngineer extends Engineer {

    public EliteEngineer(){};

    @Override
    public Engineer clone() throws CloneNotSupportedException {
        return new EliteEngineer();
    }

    public String getName(){
        return "Elite Engineer!";
    }
}

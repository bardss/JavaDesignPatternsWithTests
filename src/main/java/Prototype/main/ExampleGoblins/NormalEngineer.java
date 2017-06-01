package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Engineer;

public class NormalEngineer extends Engineer {

    public NormalEngineer(){};

    @Override
    public NormalEngineer clone() throws CloneNotSupportedException {
        return new NormalEngineer();
    }

    public String getName(){
        return "Normal Engineer!";
    }
}

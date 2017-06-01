package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Warrior;

public class EliteWarrior extends Warrior {

    public EliteWarrior(){};

    @Override
    public EliteWarrior clone() throws CloneNotSupportedException {
        return new EliteWarrior();
    }

    public String getName(){
        return "Elite Warrior!";
    }
}

package Prototype.main.ExampleGoblins;

import Prototype.main.Prototypes.Warrior;

public class NormalWarrior extends Warrior {

    public NormalWarrior(){};

    @Override
    public NormalWarrior clone() throws CloneNotSupportedException {
        return new NormalWarrior();
    }

    public String getName(){
        return "Normal Warrior!";
    }

}

package Decorator.main;

import Decorator.main.Soldiers.Axeman;
import Decorator.main.Soldiers.Crossbowman;
import Decorator.main.Soldiers.SimpleSoldier;
import Decorator.main.Soldiers.Swordman;

public class Decorator {

    public static void main(String[] args) {

        SimpleSoldier simpleSoldier = new SimpleSoldier();
        simpleSoldier.scream();
        System.out.println("attackEnemy: " + simpleSoldier.attackEnemy());
        System.out.println("chanceToHitEnemy: " + simpleSoldier.chanceToHitEnemy());
        System.out.println("chanceToAvoidAttack: " + simpleSoldier.chanceToAvoidAttack());
        System.out.println("chanceToDefend: " + simpleSoldier.chanceToDefend() + "\n");

        Swordman swordman = new Swordman(simpleSoldier);
        swordman.scream();
        System.out.println("attackEnemy: " + swordman.attackEnemy());
        System.out.println("chanceToHitEnemy: " + swordman.chanceToHitEnemy());
        System.out.println("chanceToAvoidAttack: " + swordman.chanceToAvoidAttack());
        System.out.println("chanceToDefend: " + swordman.chanceToDefend() + "\n");

        Axeman axeman = new Axeman(simpleSoldier);
        axeman.scream();
        System.out.println("attackEnemy: " + axeman.attackEnemy());
        System.out.println("chanceToHitEnemy: " + axeman.chanceToHitEnemy());
        System.out.println("chanceToAvoidAttack: " + axeman.chanceToAvoidAttack());
        System.out.println("chanceToDefend:" + axeman.chanceToDefend() + "\n");

        Crossbowman crossbowman = new Crossbowman(simpleSoldier);
        crossbowman.scream();
        System.out.println("attackEnemy: " + crossbowman.attackEnemy());
        System.out.println("chanceToHitEnemy: " + crossbowman.chanceToHitEnemy());
        System.out.println("chanceToAvoidAttack: " + crossbowman.chanceToAvoidAttack());
        System.out.println("chanceToDefend: " + crossbowman.chanceToDefend() + "\n");

    }

}

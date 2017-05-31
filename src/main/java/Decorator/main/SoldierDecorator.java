package Decorator.main;

import Decorator.main.Soldiers.SimpleSoldier;

public class SoldierDecorator implements Soldier{

    private SimpleSoldier sampleSoldier;

    public SoldierDecorator(SimpleSoldier sampleSoldier) {
        this.sampleSoldier = sampleSoldier;
    }

    @Override
    public int attackEnemy() {
        return sampleSoldier.attackEnemy();
    }

    @Override
    public double chanceToHitEnemy() {
        return sampleSoldier.chanceToHitEnemy();
    }

    @Override
    public double chanceToAvoidAttack() {
        return sampleSoldier.chanceToAvoidAttack();
    }

    @Override
    public double chanceToDefend() {
        return sampleSoldier.chanceToDefend();
    }

    @Override
    public void scream() {
        sampleSoldier.scream();
    }
}

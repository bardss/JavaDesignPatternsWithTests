package Decorator.main.Soldiers;

import Decorator.main.SoldierDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Axeman extends SoldierDecorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Axeman.class);

    public Axeman(SimpleSoldier sampleSoldier) {
        super(sampleSoldier);
    }

    public int attackEnemy() {
        return super.attackEnemy() + 20;
    }

    public double chanceToHitEnemy() {
        return super.chanceToHitEnemy() + 0.2;
    }

    public double chanceToAvoidAttack() {
        return super.chanceToAvoidAttack() - 0.1;
    }

    public double chanceToDefend() {
        return super.chanceToDefend() + 0.2;
    }

    public void scream() {
        LOGGER.info("Axe! Axe! Axeman!");
    }

}

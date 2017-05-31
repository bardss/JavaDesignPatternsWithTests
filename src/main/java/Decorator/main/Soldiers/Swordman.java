package Decorator.main.Soldiers;

import Decorator.main.SoldierDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swordman extends SoldierDecorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Swordman.class);

    public Swordman(SimpleSoldier sampleSoldier) {
        super(sampleSoldier);
    }

    public int attackEnemy() {
        return super.attackEnemy() + 10;
    }

    public double chanceToHitEnemy() {
        return super.chanceToHitEnemy() + 0.1;
    }

    public double chanceToAvoidAttack() {
        return super.chanceToAvoidAttack() + 0.1;
    }

    public double chanceToDefend() {
        return super.chanceToDefend() + 0.1;
    }

    public void scream() {
        LOGGER.info("Super Swordman is here!");
    }

}

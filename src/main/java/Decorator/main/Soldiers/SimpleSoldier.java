package Decorator.main.Soldiers;

import Decorator.main.Soldier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleSoldier implements Soldier {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleSoldier.class);

    @Override
    public int attackEnemy() {
        return 10;
    }

    @Override
    public double chanceToHitEnemy() {
        return 0.5;
    }

    @Override
    public double chanceToAvoidAttack() {
        return 0.3;
    }

    @Override
    public double chanceToDefend() {
        return 0.3;
    }

    @Override
    public void scream() {
        LOGGER.info("It's me! Normal soldier!");
    }
}

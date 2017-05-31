package Decorator.test;

import Decorator.main.Soldiers.SimpleSoldier;
import Decorator.main.Soldiers.Swordman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Tests for {@link Swordman}
 */
public class SwordmanTest {

    @Test
    public void testSmartHostile() throws Exception {
        // Create a normal troll first, but make sure we can spy on it later on.
        final SimpleSoldier sampleSoldier = spy(new SimpleSoldier());

        // Now we want to decorate the troll to make it stronger ...
        final Swordman swordman = new Swordman(sampleSoldier);
        assertEquals(20, swordman.attackEnemy());
        verify(sampleSoldier, times(1)).attackEnemy();

        assertEquals(0.6, swordman.chanceToHitEnemy(), 0.01);
        verify(sampleSoldier, times(1)).chanceToHitEnemy();

        assertEquals(0.4, swordman.chanceToAvoidAttack(), 0.01);
        verify(sampleSoldier, times(1)).chanceToAvoidAttack();

        assertEquals(0.4, swordman.chanceToDefend(), 0.01);
        verify(sampleSoldier, times(1)).chanceToDefend();

        // Check if the clubbed troll actions are delegated to the decorated troll
//        swordman.scream();
//        verify(sampleSoldier, times(1)).scream();

//        verifyNoMoreInteractions(sampleSoldier);
    }

}

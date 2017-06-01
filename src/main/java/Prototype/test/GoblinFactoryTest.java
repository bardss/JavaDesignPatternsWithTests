package Prototype.test;

import Prototype.main.Factory.GoblinFactoryImpl;
import Prototype.main.Prototypes.Engineer;
import Prototype.main.Prototypes.Farmer;
import Prototype.main.Prototypes.Mage;
import Prototype.main.Prototypes.Warrior;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GoblinFactoryTest {

    @Test
    public void testGoblinFactory() throws Exception {
        final Mage mage = mock(Mage.class);
        final Farmer farmer = mock(Farmer.class);
        final Warrior warrior = mock(Warrior.class);
        final Engineer engineer = mock(Engineer.class);

        when(mage.clone()).thenThrow(CloneNotSupportedException.class);
        when(farmer.clone()).thenThrow(CloneNotSupportedException.class);
        when(warrior.clone()).thenThrow(CloneNotSupportedException.class);
        when(engineer.clone()).thenThrow(CloneNotSupportedException.class);

        final GoblinFactoryImpl factory = new GoblinFactoryImpl(warrior, mage, engineer, farmer);
        assertNull(factory.createMage());
        assertNull(factory.createFarmer());
        assertNull(factory.createEngineer());
        assertNull(factory.createWarrior());

        verify(mage).clone();
        verify(warrior).clone();
        verify(farmer).clone();
        verify(engineer).clone();
        verifyNoMoreInteractions(mage, warrior, farmer, engineer);
    }
}

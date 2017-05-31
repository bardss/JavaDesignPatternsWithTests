package Decorator.test;

import Decorator.main.Soldiers.SimpleSoldier;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link SimpleSoldier}
 */
public class SimpleSoldierTest {

    private InMemoryAppender appender;

    @Before
    public void setUp() {
        appender = new InMemoryAppender(SimpleSoldier.class);
    }

    @After
    public void tearDown() {
        appender.stop();
    }

    @Test
    public void testTrollActions() throws Exception {
        final SimpleSoldier simpleSoldier = new SimpleSoldier();
        assertEquals(10, simpleSoldier.attackEnemy());
        assertEquals(0.5, simpleSoldier.chanceToHitEnemy(), 0.001);
        assertEquals(0.3, simpleSoldier.chanceToAvoidAttack(), 0.001);
        assertEquals(0.3, simpleSoldier.chanceToDefend(), 0.001);
        simpleSoldier.scream();
        assertEquals("It's me! Normal soldier!", appender.getLastMessage());

        assertEquals(1, appender.getLogSize());
    }

    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender(Class clazz) {
            ((Logger) LoggerFactory.getLogger(clazz)).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        public String getLastMessage() {
            return log.get(log.size() - 1).getMessage();
        }

        public int getLogSize() {
            return log.size();
        }
    }

}

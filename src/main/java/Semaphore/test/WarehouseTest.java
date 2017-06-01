package Semaphore.test;

import Semaphore.main.Client;
import Semaphore.main.Supplier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTest {

    @Test
    public void testSemaphore() throws InterruptedException {

        Supplier supplier = new Supplier();
        Client client1 = new Client();
        Client client2 = new Client();

        client1.setHowManyTries(1);
        client2.setHowManyTries(2);
        supplier.start();
        client1.start();
        client2.start();

        Thread.sleep(500);

        assertEquals(100, supplier.numberOfDelivered());
        assertEquals(0, client1.getNumberOfBought());
        assertEquals(0, client2.getNumberOfBought());
    }

    @Test
    public void testIfClientCanBuy() throws InterruptedException {
        Client client1 = new Client();
        Client client2 = new Client();

        client1.setHowManyTries(1);
        client2.setHowManyTries(2);
        client1.start();
        client2.start();

        Thread.sleep(500);

        assertEquals(10, client1.getNumberOfBought());
        assertEquals(20, client2.getNumberOfBought());
    }

    @Test
    public void testIfClientsCanBuyMoreThanInStock() throws InterruptedException {
        Client client1 = new Client();
        Client client2 = new Client();

        client1.setHowManyTries(5);
        client2.setHowManyTries(5);
        client1.start();
        client2.start();

        Thread.sleep(1000);

        assertEquals(40, client1.getNumberOfBought() + client2.getNumberOfBought());
    }

}

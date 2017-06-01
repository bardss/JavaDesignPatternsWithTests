package Semaphore.main;

public class Semaphore {

    public static void main(String[] args) {

        Client client1 = new Client();
        Client client2 = new Client();
        Supplier supplier = new Supplier();

        client1.setHowManyTries(12);
        client2.setHowManyTries(16);

        client1.start();
        client2.start();
        supplier.start();

    }

}

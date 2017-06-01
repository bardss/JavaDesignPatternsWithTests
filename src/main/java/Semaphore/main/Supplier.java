package Semaphore.main;

public class Supplier extends Thread{

    private Warehouse warehouse;
    private int delivered;

    public Supplier(){
        delivered = 0;
        warehouse = Warehouse.getInstance();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            try {
                doDelivery();
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doDelivery() throws InterruptedException {
        warehouse.setWarehouseCloseForDelivery();
        delivered += warehouse.deliverProducts(100);
        sleep(500);
        warehouse.setWarehouseOpen();
    }

    public int numberOfDelivered(){
        return delivered;
    }

}

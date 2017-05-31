package Semaphore.main;

public class Supplier extends Thread{

    private Warehouse warehouse;

    public Supplier(){
        warehouse = Warehouse.getInstance();
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                warehouse.setWarehouseCloseForDelivery();
                warehouse.deliverProducts(60);
                sleep(500);
                warehouse.setWarehouseOpen();
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

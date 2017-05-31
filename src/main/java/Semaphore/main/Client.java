package Semaphore.main;

public class Client extends Thread{

    private Warehouse warehouse;
    private int boughtProducts;

    public Client(){
        warehouse = Warehouse.getInstance();
        boughtProducts = 0;
        start();
    }

    @Override
    public void run() {
        while (true){
            try {
                if (boughtProducts < 100) {
                    boughtProducts += warehouse.buyProducts(10);
                    sleep(135);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

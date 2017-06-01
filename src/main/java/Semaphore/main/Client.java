package Semaphore.main;

public class Client extends Thread{

    private Warehouse warehouse;
    private int boughtProducts;
    private int howManyTries;

    public Client(){
        warehouse = Warehouse.getInstance();
        boughtProducts = 0;
        howManyTries = 0;
    }

    @Override
    public void run() {
        while (true){
            try {
                for (int i = 0 ; i < howManyTries; i++){
                    buyProducts();
                }
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setHowManyTries(int howManyTries){
        this.howManyTries = howManyTries;
    }

    public void buyProducts() throws InterruptedException {
        boughtProducts += warehouse.buyProducts(10);
        sleep(135);
    }

    public int getNumberOfBought(){
        return boughtProducts;
    }

}

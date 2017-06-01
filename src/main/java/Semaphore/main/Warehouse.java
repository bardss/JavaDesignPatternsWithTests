package Semaphore.main;

import Decorator.main.Soldiers.Axeman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Warehouse {

    private static final Logger LOGGER = LoggerFactory.getLogger(Warehouse.class);


    private static Warehouse instance;

    private int productsInStock;

    //semaphore
    private boolean isWarehouseFree;

    public Warehouse(){
        productsInStock = 40;
        isWarehouseFree = true;
    }

    public static Warehouse getInstance(){
        if (instance == null){
            instance = new Warehouse();
            return instance;
        }
        return instance;
    }

    public void setWarehouseCloseForDelivery(){
        isWarehouseFree = false;
        LOGGER.info("Warehouse is close for delivery.");
    }

    public void setWarehouseOpen(){
        isWarehouseFree = true;
        LOGGER.info("Warehouse is open.");
    }

    public int deliverProducts(int newProducts){
        if (!isWarehouseFree){
            productsInStock += newProducts;
            LOGGER.info("Supplier delivered " + newProducts + " new products." + "Now in stock " + productsInStock + " products.");
            return newProducts;
        }
        return 0;
    }

    public int buyProducts(int numberOfProductsToBuy){
        if (isWarehouseFree){
            if (productsInStock >= numberOfProductsToBuy) {
                productsInStock -= numberOfProductsToBuy;
                LOGGER.info("Client bought " + numberOfProductsToBuy + " products." + "Bought by: " + Thread.currentThread());
                return numberOfProductsToBuy;
            }
        }
        return 0;
    }

}

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
        productsInStock = 0;
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

    public void deliverProducts(int newProducts){
        if (!isWarehouseFree){
            productsInStock += newProducts;
            LOGGER.info("Supplier delivered " + newProducts + " new products." + "Now in stock " + productsInStock + " products.");
        }
    }

    public int buyProducts(int numberOfProductsToBuy){
        if (isWarehouseFree){
            productsInStock -= numberOfProductsToBuy;
            LOGGER.info("Client bought " + numberOfProductsToBuy + " products." + "Bought by: " + Thread.currentThread());
            return numberOfProductsToBuy;
        }
        return 0;
    }

}

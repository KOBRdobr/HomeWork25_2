package ru.zinnurov;

import java.util.*;

/**
 * The class implements the interface Basket with Map collection
 *
 * @author Nail Zinnurov
 * @version 1.0
 * cobratms@gmail.com
 * on 26.10.2018
 */

public class UserBasket implements Basket {

    Map<String, Integer> selectedProduct = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        selectedProduct.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        selectedProduct.remove(product);
        System.out.println("Done!");
        System.out.println();
    }
    @Override
    public void updateProductQuantity(String product, int quantity) {
    }

    @Override
    public void clear() {
        selectedProduct.clear();
        System.out.println("Done!");
    }

    @Override
    public Map<String, Integer> getProducts() {
        return selectedProduct;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}

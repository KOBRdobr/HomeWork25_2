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

    Map<String, Integer> productsInBasket = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        productsInBasket.put(product.getName(), product.getQuantity());
        System.out.println("Done!");
    }

    @Override
    public void removeProduct(String nameProduct) {
        productsInBasket.remove(nameProduct);
        System.out.println("Done!");
    }

    @Override
    public void clear() {
        productsInBasket.clear();
        System.out.println("Done!");
    }

    @Override
    public List<String> getProducts() {

        List<String> nameProduct = new ArrayList<>();
        for (String key : productsInBasket.keySet()) {
            nameProduct.add(key);
        }

        return nameProduct;
    }

    @Override
    public int getProductQuantity(String product) {
        return  productsInBasket.get(product);
    }
}

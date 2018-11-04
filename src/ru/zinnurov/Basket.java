package ru.zinnurov;

import java.util.Map;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 03.11.2018
 */

public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    Map<String, Integer> getProducts();

    int getProductQuantity(String product);
}

package ru.zinnurov;

import java.util.List;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 03.11.2018
 */

public interface Basket {

    void addProduct(Product product);

    void removeProduct(String nameProduct);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}

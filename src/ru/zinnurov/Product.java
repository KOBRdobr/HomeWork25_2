package ru.zinnurov;


/**
 * In the class Product is stored the type and name of the product.
 *
 * @author Nail Zinnurov
 * @version 1.0
 * cobratms@gmail.com
 * on 26.10.2018
 */

public class Product {
    private ProductType type;
    private String name;

    public Product(ProductType type, String name) {
        this.type = type;
        this.name = name;

    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

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
    private final ProductType type;
    private final String name;
    private final int quantityInStock;

    public Product(ProductType type, String name, int quantityInStock) {
        this.type = type;
        this.name = name;
        this.quantityInStock = quantityInStock;
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", quantity=" + quantityInStock +
                '}';
    }
}

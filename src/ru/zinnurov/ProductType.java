package ru.zinnurov;


/**
 * In ProductType enum stored types of products.
 *
 * @author Nail Zinnurov
 * @version 1.0
 * cobratms@gmail.com
 * on 26.10.2018
 */

public enum ProductType {
    BREAD("Bread"), MILK("Milk"), VEGETABLES("Vegetables");

    String typeName;
    ProductType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}

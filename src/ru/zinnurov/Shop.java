package ru.zinnurov;


import java.util.Arrays;
import java.util.List;

/**
 * Main class Shop containing products
 *
 * @author Nail Zinnurov
 * @version 1.0
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class Shop {

    private List<Product> allProducts = Arrays.asList(
            new Product(ProductType.BREAD, "Brown tommy", 10),
            new Product(ProductType.MILK, "Soy Milk", 10),
            new Product(ProductType.VEGETABLES, "Potato", 10),
            new Product(ProductType.BREAD, "Wheat bread", 10),
            new Product(ProductType.MILK, "Oat Milk", 10),
            new Product(ProductType.VEGETABLES, "Tomato", 10)
    );

    private UserBasket userBasket = new UserBasket();
    private UserInteractor interactor = new UserInteractor();

    public static void main(String[] args) {
        new Shop().start();
    }

    public void start() {
        ActionType action = interactor.showWelcomeMenu();
        switch (action) {
            case SHOW_PRODUCTS:
                showProducts();
                break;
            case SHOW_CART:
                workWithCart();
                break;
            case EXIT:
                return;
        }
        start();
    }

    private void workWithCart() {
        ActionType action = interactor.showCartActionsMenu();

        switch (action) {
            case REMOVE_PRODUCT:
                if(userBasket.getProducts().size() == 0) {
                    System.out.println("Basket is Empty");
                }
                else {
                    String productToRemove = interactor.showProductWantedToRemove(userBasket);
                    userBasket.removeProduct(productToRemove);
                }
                break;
            case CLEAR_BASKET:
                userBasket.clear();
                break;
        }
    }

    private void showProducts() {
        interactor.showAllProductsMenu(allProducts);
        Product product = interactor.chooseProduct(allProducts);
        userBasket.addProduct(product);
    }
}

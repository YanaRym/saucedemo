package org.tms.service;

import org.tms.page.CartPage;

public class CartPageService {

    CartPage cartPage = new CartPage();

    public String getItemNameFromCart() {
        return cartPage.getItemName();
    }

    public void proceedToCheckout() {
        InventoryPageService inventoryPageService = new InventoryPageService();
        inventoryPageService.addProductToShoppingContainer();
        cartPage.goToCheckout();
    }
}

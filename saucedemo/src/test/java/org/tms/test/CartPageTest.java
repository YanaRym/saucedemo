package org.tms.test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.CartPageService;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;

public class CartPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void addTShirtToCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        CartPageService cartPageService = new CartPageService();
        inventoryPageService.addProductToShoppingContainer();
        String actualItemName = cartPageService.getItemNameFromCart();
        String expectedItemName = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(actualItemName, expectedItemName, "Wrong item was added to the cart.");
    }
}

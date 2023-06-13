package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.*;

public class CheckoutPageTest extends BaseTest {

    private LoginPageService loginPageService;


    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void completeCheckoutTest() {
        User user = new User("standard_user", "secret_sauce");
        loginPageService.login(user);
        CartPageService cartPageService = new CartPageService();
        cartPageService.proceedToCheckout();
        CheckoutInformationPageService checkoutInformationPageService = new CheckoutInformationPageService();
        checkoutInformationPageService.fillInCheckoutInfo(new User("Jane", "Foster", "34769"));
        CheckoutOverviewPageService checkoutOverviewPageService = new CheckoutOverviewPageService();
        checkoutOverviewPageService.completeOrder();
        CheckoutCompletePageService checkoutCompletePageService = new CheckoutCompletePageService();
        Boolean isCheckoutComplete = checkoutCompletePageService.isCheckoutComplete();
        Assert.assertTrue(isCheckoutComplete, "Checkout failed.");
    }
}

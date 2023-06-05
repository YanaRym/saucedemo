package org.tms.service;

import org.tms.page.CheckoutOverviewPage;

public class CheckoutOverviewPageService {

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    public void completeOrder() {
        checkoutOverviewPage.clickFinishButton();
    }
}

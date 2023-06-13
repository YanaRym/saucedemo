package org.tms.service;

import org.tms.page.CheckoutCompletePage;

public class CheckoutCompletePageService {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public boolean isCheckoutComplete() {
        return checkoutCompletePage.isBackHomeButtonDisplayed();
    }
}

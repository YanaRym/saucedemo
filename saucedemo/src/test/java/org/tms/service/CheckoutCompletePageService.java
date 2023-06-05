package org.tms.service;

import org.tms.page.CheckoutCompletePage;

public class CheckoutCompletePageService {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public boolean checkoutIsComplete() {
        return checkoutCompletePage.backHomeButtonIsDisplayed();
    }
}

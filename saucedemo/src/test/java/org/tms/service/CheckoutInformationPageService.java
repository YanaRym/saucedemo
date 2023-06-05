package org.tms.service;

import org.tms.model.User;
import org.tms.page.CheckoutInformationPage;

public class CheckoutInformationPageService {

    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();

    public void fillInCheckoutInfo(User user) {
        checkoutInformationPage.fillInFirstNameField(user.getFirstName())
                .fillInLastNameField(user.getLastName())
                .fillInZipCodeField(user.getZipCode())
                .clickContinueButton();
    }
}

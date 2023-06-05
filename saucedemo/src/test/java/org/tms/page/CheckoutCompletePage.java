package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backHomeButton;

    public boolean backHomeButtonIsDisplayed() {
        return waitVisibilityOf(backHomeButton).isDisplayed();
    }
}

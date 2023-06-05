package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public void clickFinishButton() {
        waitElementToBeClickable(finishButton).click();
    }
}

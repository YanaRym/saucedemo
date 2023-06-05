package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement itemName;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public String getItemName() {
        return itemName.getText();
    }

    public void goToCheckout() {
        waitElementToBeClickable(checkoutButton).click();
    }


}

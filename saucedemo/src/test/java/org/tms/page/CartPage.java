package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement itemName;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public String getItemName() {
        return itemName.getText();
    }

    public void goToCheckout() {
        log.info("Proceed to checkout");
        waitElementToBeClickable(checkoutButton).click();
    }


}

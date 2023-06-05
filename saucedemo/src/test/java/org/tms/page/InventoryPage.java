package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addTShirtToCartButton;

    @FindBy(xpath = "//div[@id=\"shopping_cart_container\"]/a")
    private WebElement shoppingCartContainer;

    public String getTextOfNameOfMainPageSection() {
        return waitVisibilityOf(nameOfMainPageSection).getText();
    }

    public void addTShirtToCart() {
        addTShirtToCartButton.click();
        waitElementToBeClickable(shoppingCartContainer).click();
    }

}

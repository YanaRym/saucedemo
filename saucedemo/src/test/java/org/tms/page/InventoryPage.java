package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.tms.utilities.Constants.FIRST_ITEM_INDEX;

@Log4j2
public class InventoryPage extends BasePage {

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//div[@class='inventory_item'][" + FIRST_ITEM_INDEX + "]/div[2]/div[2]/button")
    private WebElement item;

    @FindBy(xpath = "//div[@id=\"shopping_cart_container\"]/a")
    private WebElement shoppingCartContainer;

    public String getTextOfNameOfMainPageSection() {
        return waitVisibilityOf(nameOfMainPageSection).getText();
    }

    public void addItemToCart() {
        log.info("Add item to the cart");
        item.click();
        waitElementToBeClickable(shoppingCartContainer).click();
    }

}

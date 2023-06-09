package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CheckoutInformationPage extends BasePage {

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipCodeField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueButton;

    public CheckoutInformationPage fillInFirstNameField(String firstName) {
        log.info("Fill in user info");
        waitVisibilityOf(firstNameField).sendKeys(firstName);
        return this;
    }

    public CheckoutInformationPage fillInLastNameField(String lastName) {
        waitVisibilityOf(lastNameField).sendKeys(lastName);
        return this;
    }

    public CheckoutInformationPage fillInZipCodeField(String zipCode) {
        waitVisibilityOf(zipCodeField).sendKeys(zipCode);
        return this;
    }

    public CheckoutInformationPage clickContinueButton() {
        waitElementToBeClickable(continueButton).click();
        return this;
    }

}

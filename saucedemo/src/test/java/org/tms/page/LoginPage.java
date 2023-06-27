package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        log.info("Open log in page");
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(String userName) {
        log.info("Fill in username");
        waitVisibilityOf(usernameField).sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String keyPassword) {
        log.info("Fill in password");
        waitVisibilityOf(passwordField).sendKeys(keyPassword);
        return this;
    }

    public void clickLoginButton() {
        waitElementToBeClickable(loginButton).click();
    }

}

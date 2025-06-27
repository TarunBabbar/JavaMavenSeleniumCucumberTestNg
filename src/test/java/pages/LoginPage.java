package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class LoginPage extends BasePage {
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String getSauceDemoUrl() {
        return ConfigReader.get("saucedemo.url");
    }

    public void open() {
        driver.get(getSauceDemoUrl());
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}

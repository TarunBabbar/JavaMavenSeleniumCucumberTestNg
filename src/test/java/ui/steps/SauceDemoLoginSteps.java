package ui.steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.ProductsPage;
import selenium.SeleniumDriver;
import utilities.ConfigReader;
import static org.testng.Assert.assertTrue;

public class SauceDemoLoginSteps {
    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        loginPage = new LoginPage(SeleniumDriver.getDriver());
        loginPage.open();
    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        String username = ConfigReader.get("saucedemo.username");
        String password = ConfigReader.get("saucedemo.password");
        loginPage.login(username, password);
    }

    @Then("I should see the products page")
    public void i_should_see_the_products_page() {
        productsPage = new ProductsPage(SeleniumDriver.getDriver());
        assertTrue(productsPage.isAt());
        SeleniumDriver.quitDriver();
    }
}

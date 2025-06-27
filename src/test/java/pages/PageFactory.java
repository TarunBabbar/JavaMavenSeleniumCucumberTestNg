package pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }

    public ProductsPage getProductsPage() {
        return new ProductsPage(driver);
    }
}

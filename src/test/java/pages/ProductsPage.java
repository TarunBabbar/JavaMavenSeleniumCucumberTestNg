package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private final By productsTitle = By.className("title");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return driver.findElement(productsTitle).getText().equalsIgnoreCase("Products");
    }
}

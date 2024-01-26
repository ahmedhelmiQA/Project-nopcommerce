package Pages.WishList;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage  {
    private WebDriver driver;
    public WishListPage(WebDriver driver){
        this.driver=driver;
    }

    private final By productName = By.className("product-name");
    private final By productSpec = By.className("attributes");
    private final By itemPrice = By.className("product-unit-price");
    private final By quantityNumber = By.xpath("//td//input[@class='qty-input']");
    private final By totalPrice = By.className("product-subtotal");
    private final By removeItem = By.className("remove-btn");

    public String productName(){
        return driver.findElement(productName).getText();
    }
    public String productSpecifications(){
        return driver.findElement(productSpec).getText();
    }
    public String itemPrice(){
        return driver.findElement(itemPrice).getText();
    }
    public String QuantityNumber(){
        return driver.findElement(quantityNumber).getText();
    }
    public String totalPrice(){
        return driver.findElement(totalPrice).getText();
    }
    public void clickremoveItem(){
        driver.findElement(removeItem).click();
    }

    public WebElement findElement(By by){
        var webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}

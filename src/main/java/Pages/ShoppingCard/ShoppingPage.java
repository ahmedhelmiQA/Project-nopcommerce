package Pages.ShoppingCard;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingPage {

    WebDriver driver;
    public ShoppingPage(WebDriver driver) {
       this.driver = driver;
    }

    private final By productName = By.className("product-name");
    private final By productSpec = By.xpath("//td/div[@class='attributes']");
    private final By uintPrice = By.className("product-unit-price");
    private final By quantityNumber = By.xpath("//td//input[@class='qty-input']");
    private final By toralPrice = By.className("product-subtotal");

    private final By removefromcartBtn = By.className("remove-btn");
    private final By updateCartBtu = By.id("updatecart");
    private final By continueShoppingBtu = By.name("continueshopping");
    private final By estimateShippingBtu = By.id("estimate-shipping-popup");
    public final By agreeService = By.id("termsofservice");
   private final By checkoutBtu = By.id("checkout");


    public String productName(){
        return driver.findElement(productName).getText();
    }
    public String productSpecs(){
        return driver.findElement(productSpec).getText();
    }
    public String uintPrice(){
        return driver.findElement(uintPrice).getText();
    }
    public String quantityNumber(){
        return driver.findElement(quantityNumber).getAttribute("value");
    }
    public String totalPrice(){
        return driver.findElement(toralPrice).getText();
    }

    public void clickupDateCartBtu(){
        driver.findElement(updateCartBtu).click();
    }
    public void clickcontinueShopping(){
        driver.findElement(continueShoppingBtu);
    }
    public void clickeStimateShipping(){
        driver.findElement(estimateShippingBtu).click();
    }
    public void clickRemovefromcartBtn(){
        driver.findElement(removefromcartBtn).click();
    }

    public void clickagreeService(){
        driver.findElement(agreeService).click();
    }
    public void checkout(){
        driver.findElement(checkoutBtu).click();
    }


    public WebElement findElement(By by){
        var webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


}

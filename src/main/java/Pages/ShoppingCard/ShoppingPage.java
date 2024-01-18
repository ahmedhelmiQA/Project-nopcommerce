package Pages.ShoppingCard;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {

    WebDriver driver;
    public ShoppingPage(WebDriver driver) {
       this.driver = driver;
    }

    private final By productName = By.className("product-name");
    private final By productSpecs = By.className("attributes");
    private final By uintPrice = By.className("product-unit-price");
    private final By quantityNumber = By.id("itemquantity11224");
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
        return driver.findElement(productSpecs).getText();
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

    public void agreeService(){
        driver.findElement(agreeService).click();
    }
    public void checkout(){
        driver.findElement(checkoutBtu).click();
    }




}

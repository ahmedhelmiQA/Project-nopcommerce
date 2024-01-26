package Pages.Productes;

import Pages.ShoppingCard.ShoppingPage;
import Pages.WishList.WishListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductesPage {
    private WebDriver driver;

    public ProductesPage(WebDriver driver) {
        this.driver = driver;
    }
       private final By processorList = By.id("product_attribute_1");
        private final By ramList = By.id("product_attribute_2");
        private final By hddCheckBox = By.id("product_attribute_3_6");
        private final By OsCheckBox = By.id("product_attribute_4_9");
        private final By SoftwareCheckBox = By.id("product_attribute_5_11");
        private final By enteredQuantity = By.className("qty-input");
        private final By addCardBtu = By.id("add-to-cart-button-1");
    private final By successMsg = By.xpath("//div[@class=\"bar-notification success\"]//p");
        private final By addWishListBtu= By.id("add-to-wishlist-button-1");
        private final By closeMess = By.xpath("//span[@class='close']");
        // private final By compareListBtu = By.xpath("//*[@class='compare-products']/button");


        public void fillInfoAndAddForProduct1(){
            WebElement element =  driver.findElement(ramList);
            Select select = new Select(element);
            select.selectByValue("4");
            driver.findElement(hddCheckBox).click();
            driver.findElement(OsCheckBox).click();
            driver.findElement(SoftwareCheckBox).click();
        }
        public void EnteredQuantity(){
            driver.findElement(enteredQuantity).click();
        }
        public ShoppingPage ClickAddCardBtu(){
            driver.findElement(addCardBtu).click();
            return new ShoppingPage(driver);
        }
        public String getSuccessMess(){
            return driver.findElement(successMsg).getText();
        }
        public void clickCloseMess(){
            driver.findElement(closeMess).click();
        }
        public WishListPage ClickAddWishList(){
            driver.findElement(addWishListBtu).click();
            return new WishListPage(driver);
        }
        public void SelectProcess(){
            WebElement process = driver.findElement(processorList);
            Select select = new Select(process);
            select.selectByValue("2");
        }

}

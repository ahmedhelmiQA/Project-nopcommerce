package Pages.Search;
import Pages.Productes.ProductesPage;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class SearchPage {

    private WebDriver driver;
    public SearchPage(WebDriver driver) {
      this.driver = driver;
    }

    private final By searchBox = By.className("search-text");
    private final By productTitle = By.xpath("//h2[@class='product-title']");
    private final By productDetails = By.xpath("//h2[@class='product-title']//a");


    public void clickSearchBox(){
        driver.findElement(searchBox).click();
    }
    public void clickProductTitle(){
        driver.findElement(productTitle).click();
    }

    public void ProductDetails() {
        var element = driver.findElement(productDetails);
        element.click();

    }



}

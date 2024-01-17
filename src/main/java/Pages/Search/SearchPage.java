package Pages.Search;
import Pages.Productes.ProductesPage;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By searchBox = By.className("search-text");
    private final By productTitle = By.xpath("//*[@data-productid='18']//h2");
    private final By productDetails = By.xpath("//*[@data-productid='18']//a");


    public void clickSearchBox(){
        driver.findElement(searchBox).click();
    }
    public void clickProductTitle(){
        driver.findElement(productTitle).click();
    }

    public String ProductDetails(){
        driver.findElement(productDetails).getText();
        return new ProductesPage(driver).toString();
    }

}

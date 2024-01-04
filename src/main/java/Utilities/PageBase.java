package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }
    public static void Clicking(WebElement element){
        element.click();
    }
    public static void Sendkeys(WebElement element){
        element.sendKeys();
    }
    public static void GetText(WebElement element){
        element.getText();
    }





}

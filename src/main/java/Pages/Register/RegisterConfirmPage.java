package Pages.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterConfirmPage {
    private WebDriver driver;
    public RegisterConfirmPage(WebDriver driver){
        this.driver = driver;
    }
    private final By continueBtu = By.xpath("//a[contains(@class,'continue-button')]");
    private final By registerMess = By.xpath("//div[@class='result']");

    public String getResultMess(){
        return driver.findElement(registerMess).getText();
    }
    public void clickContinueBtu(){
        driver.findElement(continueBtu).click();

    }
}

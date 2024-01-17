package Pages.Login;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By welcomeMessage = By.xpath("//*[@class='topic-block-title']/h2");
    private final By emailField = By.id("Email");
    private final By passwordField = By.id("Password");
    private final By loginBtu = By.xpath("//div/button[@type='submit']");


    public void fillLoginInfo(String mail, String password){
    driver.findElement(emailField).sendKeys(mail);
    driver.findElement(passwordField).sendKeys(password);
    }
    public String getMessageWel(){
        return driver.findElement(welcomeMessage).getText();
    }
    public void clickLoginBtu (){
        driver.findElement(loginBtu).click();
    }
}

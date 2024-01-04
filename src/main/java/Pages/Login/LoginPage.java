package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By messageWellcome = By.xpath("//div[@class=\"page-title\"]//h1");
    private final By emailField = By.id("Email");
    private final By passwordField = By.id("Password");
    private final By forgetPassword = By.partialLinkText("Forgot password");
    private final By loginBtu = By.xpath("//div/button[@type='submit']");

    public String getMessageWellcome(){
     return   driver.findElement(messageWellcome).getText();

    }

    public void fillLoginInfo(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginBtu(){
        driver.findElement(loginBtu).click();
    }


}

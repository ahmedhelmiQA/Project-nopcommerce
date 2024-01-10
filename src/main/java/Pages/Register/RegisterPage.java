package Pages.Register;


import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage  {
    private WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By genderMale = By.id("gender-male");
    private final By genderFemale = By.id("gender-female");
    private final By firstNameField = By.id("FirstName");
    private final By lastNameField = By.id("LastName");
    private final By birthDayField = By.name("DateOfBirthDay");
    private final By birthMonthfield = By.name("DateOfBirthMonth");
    private final By birthYearField = By.name("DateOfBirthYear");
    private final By mailAdress = By.id("Email");
   private final By passwordField = By.id("Password");
    private final By confPasswordField = By.id("ConfirmPassword");
    private final By registerBtu = By.id("register-button");


    public void fillRegisterInfoMale(String firstName, String lastName, String day, String month, String year,
                                     String email, String password, String confPassword){
   driver.findElement(genderMale).click();
   driver.findElement(firstNameField).sendKeys(firstName);
   driver.findElement(lastNameField).sendKeys(lastName);
   selectBirthInfo(day,month,year);
   driver.findElement(mailAdress).sendKeys(email);
   driver.findElement(passwordField).sendKeys(password);
   driver.findElement(confPasswordField).sendKeys(confPassword);

    }

    private void selectBirthInfo(String day, String month, String year) {
        WebElement dayelement = driver.findElement(birthDayField);
        Select select = new Select(dayelement);
        select.selectByValue(day);

        WebElement monthelement= driver.findElement(birthMonthfield);
        select = new Select(monthelement);
        select.selectByValue(month);

        WebElement yearelment = driver.findElement(birthYearField);
        select = new Select(yearelment);
        select.selectByValue(year);
    }

    public void fillRegisterInfoFemale(String firstName, String lastName, String day, String month,
                                       String year, String mail, String password, String confpassword){
        driver.findElement(genderFemale).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        selectBirthInfo(day,month,year);
        driver.findElement(mailAdress).sendKeys(mail);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confPasswordField).sendKeys(confpassword);
    }
    public void ClickRegisterBtu(){
    driver.findElement(registerBtu).click();

    }
    private final By continueBtu = By.xpath("//a[contains(@class,'continue-button')]");
    private final By registerMess = By.xpath("//div[@class='result']");

    public String getResultMess(){
        return driver.findElement(registerMess).getText();
    }
    public void clickContinueBtu() {
        driver.findElement(continueBtu).click();
    }

}

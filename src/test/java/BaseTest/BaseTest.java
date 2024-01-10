package BaseTest;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

    public class BaseTest {
   protected WebDriver driver;



    @BeforeClass
    public void address(){
     driver = new ChromeDriver();
     driver.get("https://demo.nopcommerce.com");
     driver.manage().window().maximize();
        //homePage = new HomePage(driver);
    }


    @AfterClass
 public void Quite(){
     driver.quit();
    }



}

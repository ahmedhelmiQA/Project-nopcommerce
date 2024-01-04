import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected WebDriver driver;


    @BeforeClass
    public void address(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        //homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void Quite(){
//        driver.quit();
//    }
}

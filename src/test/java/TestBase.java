import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public  class TestBase {
    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Thread.sleep(5000);
        //homePage = new HomePage(driver);
    }
     @BeforeMethod
     public void gohome(){
    driver.navigate().to("https://demo.nopcommerce.com");
    homePage = new HomePage(driver);
     }
    @AfterClass
    public void Quite(){
        driver.quit();
    }


}

package BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void address() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        //Thread.sleep(5000);
        //homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void Quite(){
//        driver.quit();
//    }
}

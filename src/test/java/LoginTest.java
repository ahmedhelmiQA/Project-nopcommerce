import Pages.Login.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    protected HomePage homePage;
    protected LoginPage loginPage;

    @Test
    public void loginMaleTest(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginBtu();
        loginPage.fillLoginInfo("test@test.net","123456");
        loginPage.clickLoginBtu();

    }
}

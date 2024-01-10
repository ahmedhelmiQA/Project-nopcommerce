import Pages.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    protected HomePage homePage;
    protected LoginPage loginPage;

    @Test
    public void loginMaleTest(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginBtu();
        loginPage.fillLoginInfo("test@dex.net","123456");
        loginPage.clickLoginBtu();
        String expectedResult = "Welcom";
        String actualResult = loginPage.WelcomeMess();
        Assert.assertEquals(actualResult,expectedResult,"Login was unsuccessful");

    }
}

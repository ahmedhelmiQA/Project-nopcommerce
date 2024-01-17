import BaseTest.TestBase;
import Pages.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    protected HomePage homePage;
    protected LoginPage loginPage;

    @Test
    public void loginMaleTest(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginBtu();
        loginPage.fillLoginInfo("dex1@dv.net","123456");
        loginPage.clickLoginBtu();
        String expectedResult = "Welcome to our store";
        String actualResult = loginPage.getMessageWel();
        Assert.assertEquals(actualResult,expectedResult,"Login was unsuccessful");

    }
    @Test
    public void LoginFelmalTest(){
        homePage = new HomePage(driver);
        loginPage= homePage.clickLoginBtu();
        loginPage.fillLoginInfo("sar@sar.cm", "123456");
        loginPage.clickLoginBtu();
        String expectedResult ="Welcome ";
        String actualResult = loginPage.getMessageWel();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

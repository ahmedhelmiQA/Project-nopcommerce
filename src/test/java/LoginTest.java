import Pages.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    protected HomePage homePage;
    protected LoginPage loginPage;

    @Test (groups = "Male-user")
    public void loginMaleTest(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginBtu();
        loginPage.fillLoginInfo("dex10@sav.net","123456");
        loginPage.clickLoginBtu();
        String expectedResult = "Welcome to our store";
        String actualResult = loginPage.getMessageWel();
        Assert.assertEquals(actualResult,expectedResult,"Login was unsuccessful");

    }
    @Test (groups = "Female-user")
    public void LoginFelmalTest(){
        homePage = new HomePage(driver);
        loginPage= homePage.clickLoginBtu();
        loginPage.fillLoginInfo("vmal@tet.com", "123456");
        loginPage.clickLoginBtu();
        String expectedResult ="Welcome ";
        String actualResult = loginPage.getMessageWel();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

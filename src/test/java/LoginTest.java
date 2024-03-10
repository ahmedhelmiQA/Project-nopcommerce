import Pages.Login.LoginPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    protected HomePage homePage;
    protected LoginPage loginPage;
    @DataProvider(name = "testdata")
    public Object[][] testdata(){
            return new Object[][]{
                    {"dex11@vav.net","123456789"},
                    {"dex10@vav.net","123456"}
            };
    }
    @Test (dataProvider = "testdata")
    public void loginMaleTest(String mail , String password){
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginBtu();
        loginPage.fillLoginInfo(mail,password);
        loginPage.clickLoginBtu();
//        String expectedResult ="Welcome ";
//        String actualResult = loginPage.getMessageWel();
//      //  Assert.assertTrue(actualResult.contains(expectedResult));
    }

//    @Test (groups = "Female-user")
//    public void LoginFelmalTest(){
//        homePage = new HomePage(driver);
//        loginPage= homePage.clickLoginBtu();
//        loginPage.fillLoginInfo("test@noot.net", "123456");
//        loginPage.clickLoginBtu();
//        String expectedResult ="Welcome ";
//        String actualResult = loginPage.getMessageWel();
//      //  Assert.assertTrue(actualResult.contains(expectedResult));
//    }


}

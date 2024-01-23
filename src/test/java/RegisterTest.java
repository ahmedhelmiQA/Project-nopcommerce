import Pages.Register.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
private HomePage homePage;
private RegisterPage registerPage;

@Test
    public void RegisterMaleTest(){
    homePage = new HomePage(driver);
  registerPage = homePage.clickRegisterBtu();
  registerPage.fillRegisterInfoMale("ahmed","helmi","13","1","1980",
          "dex1@vav.net","123456789","123456");
  registerPage.ClickRegisterBtu();
  registerPage.clickContinueBtu();
  String expectedResult = "Welcome to our store";
  String actualResult = registerPage.getResultMess();
  Assert.assertEquals(actualResult,expectedResult);


}

@Test
    public void RegisterFemaleTest(){
    homePage = new HomePage(driver);
    registerPage = homePage.clickRegisterBtu();
    registerPage.fillRegisterInfoFemale("sara","mohamed","26","12","2021",
            "sar@vvr.cm","123456","123456");
    registerPage.ClickRegisterBtu();
    registerPage.clickContinueBtu();
    String expectedResult = "Welcome to our store";
    String actualResult = homePage.getWelcomMess();
    Assert.assertEquals(actualResult,expectedResult,"the message is incorrect");
}
}

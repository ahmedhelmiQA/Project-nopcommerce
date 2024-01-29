import Pages.Register.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
private HomePage homePage;
private RegisterPage registerPage;

@Test (groups = "Male-user")
    public void RegisterMaleTest(){
    homePage = new HomePage(driver);
  registerPage = homePage.clickRegisterBtu();
  registerPage.fillRegisterInfoMale("ahmed","helmi","13","1","1980",
          "dex10@sav.net","123456789","123456");
  registerPage.ClickRegisterBtu();
  registerPage.clickContinueBtu();
  String expectedResult = "Welcome to our store";
  String actualResult = registerPage.getResultMess();
  Assert.assertEquals(actualResult,expectedResult);


}

@Test (groups = "Female-user")
    public void RegisterFemaleTest(){
    homePage = new HomePage(driver);
    registerPage = homePage.clickRegisterBtu();
    registerPage.fillRegisterInfoFemale("sara","mohamed","26","12","2021",
            "vma3l@tet.com","123456","123456");
    registerPage.ClickRegisterBtu();
    registerPage.clickContinueBtu();
    String expectedResult = "Welcome to our store";
    String actualResult = homePage.getWelcomMess();
    Assert.assertEquals(actualResult,expectedResult,"the message is incorrect");
}
}

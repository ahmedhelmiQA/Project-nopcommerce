import Pages.Register.RegisterPage;
import org.openqa.selenium.By;
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
          "test@dex.net","123456","123456");
  registerPage.ClickRegisterBtu();


}

@Test
    public void RegisterFemaleTest(){
    homePage = new HomePage(driver);
    registerPage = homePage.clickRegisterBtu();
    registerPage.fillRegisterInfoFemale("sara","mohamed","26","12","2021",
            "sara@fa.cm","123456","123456");
    registerPage.ClickRegisterBtu();
    registerPage.clickContinueBtu();
    String expectedResult = "Your registration notcompleted";
    String actualResult = homePage.getWelcomMess();
    Assert.assertEquals(actualResult,expectedResult,"the message is incorrect");
}
}

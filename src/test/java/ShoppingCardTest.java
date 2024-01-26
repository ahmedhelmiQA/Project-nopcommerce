
import Pages.Productes.ProductesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCardTest extends TestBase {
  protected HomePage homePage;
  protected ProductesPage productesPage;

    @Test
    public void testAddingItemAndCheckingCount(){
     homePage = new HomePage(driver);
     productesPage = homePage.clickproductTitle();
    productesPage.fillInfoAndAddForProduct1();
    productesPage.ClickAddCardBtu();

//    String messageSuccess = productesPage.getSuccessMess();
//      Assert.assertTrue(messageSuccess.contains("The product has been added to your"),"item not add successfuly");
   productesPage.clickCloseMess();
    }


}

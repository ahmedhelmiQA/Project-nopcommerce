
import Pages.Productes.ProductesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCardTest extends TestBase {
  protected HomePage homePage;
  protected ProductesPage productesPage;

    @Test
    public void testAddingItemAndCheckingCount() throws InterruptedException {
     homePage = new HomePage(driver);
     productesPage = homePage.clickproductTitle();
    productesPage.fillInfoAndAddForProduct1();
    productesPage.ClickAddCardBtu();
//    String messageSuccess = productesPage.getSuccessMess();
//      Assert.assertTrue(messageSuccess.contains("The product has been added to your"),"item not add successfuly");
        //productesPage.clickCloseMess();
        Thread.sleep(5000);
    var shoppingCardTest = productesPage.clickCardPageBut();
    String expectedProductName= "Build your own computer";
    String actualProductName = shoppingCardTest.productName();
    Assert.assertTrue(actualProductName.contains(expectedProductName),"incorrect product Name");


    String expectedProductSpecifications = "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]";
    String acualProductSpecifications = shoppingCardTest.productSpecs();
    Assert.assertTrue(acualProductSpecifications.contains(expectedProductSpecifications),"incorrect Product Specification");


    String exepectedProductPrice = "$1,355.00";
    String actualProductPrice = shoppingCardTest.uintPrice();
    Assert.assertTrue(actualProductPrice.contains(exepectedProductPrice));

    }


}

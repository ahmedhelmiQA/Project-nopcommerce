
import Pages.Productes.ProductesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCardTest extends TestBase {
  protected HomePage homePage;
  protected ProductesPage productesPage;

    @Test (groups ={ "Female-user","Male-user"})
    public void testAddingItemAndCheckingCount() throws InterruptedException {
     homePage = new HomePage(driver);
     productesPage = homePage.clickproductTitle();
    productesPage.fillInfoAndAddForProduct1();
    productesPage.ClickAddCardBtu();
//    String messageSuccess = productesPage.getSuccessMess();
//      Assert.assertTrue(messageSuccess.contains("The product has been added to your"),"item not add successfuly");
    //productesPage.clickCloseMess();
        Thread.sleep(6000);
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

    String expectedProductQuantity = "1";
    String acualProductQuantity = shoppingCardTest.quantityNumber();
    Assert.assertTrue(acualProductQuantity.contains(expectedProductQuantity),"incorrect Product Quantity");

    //shoppingCardTest.clickRemovefromcartBtn();
    shoppingCardTest.clickagreeService();
    Thread.sleep(3000);
   // shoppingCardTest.clickcontinueShopping();
    }


}

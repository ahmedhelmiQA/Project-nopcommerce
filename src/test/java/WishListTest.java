
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class WishListTest extends TestBase {
        @Test
    public void testAddItemAndCheckWishList(){
      homePage = new HomePage(driver);
      var productPage = homePage.clickproductTitle();
      productPage.fillInfoAndAddForProduct1();
      productPage.ClickAddWishList();

//      String SuccessMsg = productPage.getSuccessMess();
//      Assert.assertTrue(SuccessMsg.contains("The product has been added to your"));

    }
@Test (groups = {"Female-user","Male-user"})
    public void testAddItemAndCheckWishListPage() throws InterruptedException {
    homePage = new HomePage(driver);
    var productPage = homePage.clickproductTitle();
    productPage.fillInfoAndAddForProduct1();
    productPage.ClickAddWishList();
   // productPage.clickCloseMess();

   Thread.sleep(5000);
    var wishListPage = productPage.clickwishListPageBut();
           String expectedProductName = "Build your own computer";
            String actualProductName = wishListPage.productName();
            Assert.assertTrue(actualProductName.contains(expectedProductName));

               String expectedProductSpec = "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]";
            String actualProductSpec = wishListPage.productSpecifications();
          Assert.assertTrue(actualProductSpec.contains(expectedProductSpec),"Incorrect Product specifications");


          String expectedProductPrice = "$1,355.00";
          String actualProductPrice = wishListPage.itemPrice();
          Assert.assertTrue(actualProductPrice.contains(expectedProductPrice),"incorrect Product Price");
    System.out.println(wishListPage.QuantityNumber());

    String expectedProductQty = "1";
    String actualProductQty = wishListPage.QuantityNumber();
    Assert.assertTrue(actualProductQty.contains(expectedProductQty),"Incorrect Product quantity");

        String expectedProductTotalPrice = "$1,355.00";
        String actualProductTotalPrice = wishListPage.totalPrice();
        Assert.assertTrue(actualProductTotalPrice.contains(expectedProductTotalPrice),"incorrect Product Total Price");

        wishListPage.clickremoveItem();

    }


}

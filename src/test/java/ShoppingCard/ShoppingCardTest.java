package ShoppingCard;

import BaseTest.TestBase;
import Pages.HomePage;
import Pages.Login.LoginPage;
import Pages.Productes.ProductesPage;
import org.testng.annotations.Test;

public class ShoppingCardTest extends TestBase {

    protected HomePage homePage;
    protected ProductesPage productesPage;
    @Test
    public void testAddingItemAndCheckingCoun(){
        homePage= new HomePage(driver);


    }
}

package Search;

import BaseTest.TestBase;
import Pages.HomePage;
import Pages.Search.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    protected HomePage homePage;
    protected SearchPage searchPage;

    @Test
    public void SearchTestContianeWord(){
        homePage = new HomePage(driver);


    }
}

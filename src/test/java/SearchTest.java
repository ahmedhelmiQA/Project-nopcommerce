import Pages.Search.SearchPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    protected HomePage homePage;
    protected SearchPage searchPage;

    @Test (groups = {"Female-user","Male-user"})
    public void SearchTestContianeWord(){
        String search = "Build";
        homePage = new HomePage(driver);
       homePage.searchBoxInput(search);
       homePage.clicksearchBtu();
        searchPage = new SearchPage(driver);
       searchPage.ProductDetails();
    }


}

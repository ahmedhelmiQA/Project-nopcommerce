import Pages.FollowUs.FollowUsPage;
import Pages.Login.LoginPage;
import Pages.Register.RegisterPage;
import Pages.Search.SearchPage;
import Pages.ShoppingCard.ShoppingPage;
import Pages.WishList.WishListPage;
import Pages.Productes.ProductesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
   }
    private final By registerBtn = By.className("ico-register");
    private final By loginBtn = By.className("ico-login");
    private final By wishlistBtn = By.className("ico-wishlist");
    private final By shoppingcard = By.className("ico-cart");
    private final By searchBox = By.xpath("//input[contains(@class,'search-box')]");
    private final By searchBtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");
    private final By topMenu = By.xpath("//*[@class='top-menu notmobile']");
    private final By computers = By.partialLinkText("Computers");
    private final By welcomeMess = By.xpath("//div[@class='topic-block-title']//h2");
    private final By productTitle = By.partialLinkText("Build your own computer");
    private final By addToCardBtn1 =By.xpath("//div[@data-productid='1']//button[contains(@class, 'add-to-cart')]");
    private final By addToCardBtn2 =By.xpath("//div[@data-productid='4']//button[contains(@class, 'add-to-cart')]");
    private final By addToCardBtn3 =By.xpath("//div[@data-productid='18']//button[contains(@class, 'add-to-cart')]");
    private final By addToCardBtn4 =By.xpath("//div[@data-productid='43']//button[contains(@class, 'add-to-cart')]");
    private final By addToWishBtu1 = By.xpath("//div[@data-productid='1']//button[contains(@class, 'add-to-wishlist')]");
    private final By addToWishBtu2 = By.xpath("//div[@data-productid='4']//button[contains(@class, 'add-to-wishlist')]");
    private final By addToWishBtu3 = By.xpath("//div[@data-productid='18']//button[contains(@class, 'add-to-wishlist')]");
    private final By addToWishBtu4 = By.xpath("//div[@data-productid='43']//button[contains(@class, 'add-to-wishlist')]");
    private final By faceBookBtn = By.className("facebook");
    private final By twitterBtu = By.className("twitter");
    private final By youtubeBtu =By.className("youtube");

   public RegisterPage clickRegisterBtu() {
   driver.findElement(registerBtn).click();
   return new RegisterPage(driver);

   }
  public LoginPage clickLoginBtu() {
    driver.findElement(loginBtn).click();
   return new LoginPage(driver);

    }
   public WishListPage clickWishListBtu(){
  driver.findElement(wishlistBtn).click();
  return new WishListPage(driver);
   }
   public ShoppingPage clickshoppingcard(){
   driver.findElement(shoppingcard).click();
   return new ShoppingPage(driver);
   }
    public SearchPage searchBoxInput(String input){
     driver.findElement(searchBox).sendKeys(input);
        return new SearchPage(driver);
    }
   public SearchPage clicksearchBtu(){
  driver.findElement(searchBtn).click();
   return new SearchPage(driver);
   }
   public String getWelcomMess(){
       return driver.findElement(welcomeMess).getText();
   }
    public ProductesPage clickproductTitle(){
        driver.findElement(productTitle).click();
        return new ProductesPage(driver);
    }
    public ProductesPage AddProducte1ToCardBtu(){
        driver.findElement(addToCardBtn1).click();
        return new ProductesPage(driver);
    }
    public ProductesPage AddProduct1ToWishBtu(){
        driver.findElement(addToWishBtu1).click();
        return new ProductesPage(driver);
    }
    public FollowUsPage Facebook(){
        driver.findElement(faceBookBtn).click();
        return new FollowUsPage(driver);
    }
    public FollowUsPage Twitter(){
        driver.findElement(twitterBtu).click();
        return new FollowUsPage(driver);
    }
    public FollowUsPage Youtub(){
        driver.findElement(youtubeBtu).click();
        return new FollowUsPage(driver);
    }








}
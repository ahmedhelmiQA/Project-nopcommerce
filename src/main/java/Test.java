import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //   driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//        driver.findElement(By.className("radius")).click();
        //                         clickAndHold
    /*
        WebElement A = driver.findElement(By.id("column-a"));
        WebElement B = driver.findElement(By.id("column-b"));
        Actions dropdown = new Actions(driver);
        dropdown.clickAndHold(A).moveToElement(B).release().build().perform();

     */

        ///                       WindowHandles /  switchTo().window
/*
        driver.get("https://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandle());
        String main = driver.getWindowHandle();
        driver.findElement(By.partialLinkText("Selenium")).click();

        Set<String> allwindows = driver.getWindowHandles();    // main + new windows
        for (String s : allwindows) //2
        {
            if(!s.equals(main))    // (!s.equals(main))     !s mains not equal main
                driver.switchTo().window(s);
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(main);
        System.out.println(driver.getTitle());
        driver.findElement(By.partialLinkText("Selenium")).click();
 */
        ///                     Frames
/*
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.xpath("/html/body")).getText());
*/
        //                      frame set
        /*
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
       driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("ahmed");
       driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
          */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/context_menu");
        //driver.findElement(By.className("prompt")).click();
        WebElement rightclick = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightclick).perform();
        Thread.sleep(2000);
        // driver.switchTo().alert().sendKeys("ahmed");
        driver.switchTo().alert().accept();

        //driver.quit();
    }


}



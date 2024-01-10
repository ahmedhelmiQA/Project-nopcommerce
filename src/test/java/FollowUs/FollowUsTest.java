package FollowUs;


import BaseTest.BaseTest;
import Pages.FollowUs.FollowUs;
import Pages.HomePage;
import org.testng.annotations.Test;

public class FollowUsTest extends BaseTest {

    private HomePage homePage;
    private FollowUs followUs;

    @Test
    public void followUsTest(){
        homePage = new HomePage(driver);

    }
}


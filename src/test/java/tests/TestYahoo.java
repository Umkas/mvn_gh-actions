package tests;

import org.testng.annotations.Test;
import pageObjects.YahooHomePage;

public class TestYahoo extends TestInit{

    @Test
    public void searchFieldSearch(){
        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getSearchField().sendKeys("dogs\n");
    }



    @Test
    public void clickSignInBtn(){
       goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getSignInBtn().click();
    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePageHelper;
import pageObjects.AmazonSearchResultsPage;

public class TestAmazon extends TestInit{

 //   @Test
    public void checkHeader(){
        AmazonHomePageHelper amazonHomePage = new AmazonHomePageHelper(driver);
        amazonHomePage.goToAmazon();

        Assert.assertTrue(amazonHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePage.getDeliveryTo().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchImageBtn().isDisplayed());
    }

  //  @Test
    public void checkSearch(){
        AmazonHomePageHelper amazonHomePage = new AmazonHomePageHelper(driver);
        amazonHomePage.goToAmazon();


        String findingElement = "bird";  // the word what we are looking for
        AmazonSearchResultsPage amazonSearchResultsPage = amazonHomePage.search(findingElement);

//        amazonHomePage.getSearchField().sendKeys("pen");
//        amazonHomePage.getSearchImageBtn().click();


        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.getResultsWithPenText(findingElement).size()>10);
        System.out.println(findingElement+" includes "+amazonSearchResultsPage.getResultsWithPenText(findingElement).size()+" times");
    }
}

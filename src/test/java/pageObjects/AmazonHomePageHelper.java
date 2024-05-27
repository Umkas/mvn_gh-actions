package pageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonHomePageHelper extends AmazonHomePageElements{

    public AmazonHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToAmazon(){
        driver.get("https://www.amazon.com/");
    }


    public AmazonSearchResultsPage search(String queryForSearch){
        getSearchField().sendKeys(queryForSearch);
        getSearchImageBtn().click();
        return new AmazonSearchResultsPage(driver);
    }

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonSearchResultsPage extends BasePage{

    public AmazonSearchResultsPage(WebDriver driver){
        super(driver);
    }

    public WebElement getResultsField(){
        return driver.findElement(By.xpath("//span[text()='Results']"));
    }

    public List<WebElement> getResultsWithPenText(String findingElements){
        return driver.findElements(By.xpath("//*[contains(text(),"+findingElements+")]"));
    }



}



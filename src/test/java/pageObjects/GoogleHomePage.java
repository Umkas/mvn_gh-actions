package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{


    public GoogleHomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//textarea[@name='q']"));
    }

    public WebElement getEnterBtn(){
        return driver.findElement(By.xpath("//span[text()='Войти']"));
    }
}

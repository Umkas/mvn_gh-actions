package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void before(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");   //запуск хрому візуалізації браузера
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
    }

//    @BeforeMethod
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }

    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }

    public void sleep(int s){
        try{
            Thread.sleep(1000*s);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }

    public void goToYahoo() {
        driver.get("https://www.yahoo.com/");
    }


}

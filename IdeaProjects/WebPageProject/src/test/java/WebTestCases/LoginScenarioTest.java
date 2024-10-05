package WebTestCases;

import WebPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginScenarioTest {

    public static WebDriver driver;

    @BeforeMethod
    public void loginUrlDetails(){
        //System.setProperty("Webdriver.chrome.driver","")
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.getTitle();
        driver.getCurrentUrl();
    }

    @Test
    public void calledLoginPage(){
        LoginPage.SignInOperation(driver,"Priyanka","rahulshettyacademy");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}

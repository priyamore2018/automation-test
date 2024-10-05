import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoPages {


    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.className(".reset-pwd-btn")).click();
        String element=driver.findElement(By.className("infoMsg")).getText();
        System.out.println(element);
    }
}

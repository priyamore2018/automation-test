package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static WebElement element;

    public static void setUserName(WebDriver driver, String username){
        element=driver.findElement(By.id("inputUsername"));
        element.sendKeys(username);
    }
    public static void setPassword(WebDriver driver,String userPassword){
        element=driver.findElement(By.name("inputPassword"));
        element.sendKeys(userPassword);
    }

    public static void singInClick(WebDriver driver){
        element=driver.findElement(By.className("signInBtn"));
        element.click();
    }

    public static void SignInOperation(WebDriver driver,String userName, String userPassword){
        setUserName(driver,userName);
        setPassword(driver,userPassword);
        singInClick(driver);
    }

    //ForgotPassword Link

    public static void forgotPwd(WebDriver driver){
        element=driver.findElement(By.linkText("Forgot your password?"));
        element.click();
    }

    public static void setForgotName(WebDriver driver,String name){
    element=driver.findElement(By.xpath("//input[@placeholder='Name']"));
    element.sendKeys(name);
    }

    public static void clickResetButton(WebDriver driver){
        element=driver.findElement(By.className(".reset-pwd-btn"));
        element.click();

    }

    public  static void getRestPassword(WebDriver driver,String resetPwd)
    {
        element=driver.findElement(By.className("infoMsg"));
        element.

    }
}

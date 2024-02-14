package parllelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class parllelTest1 {
    WebDriver driver;

    @Test(priority = 0)
    void title(){
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String titleName= driver.getTitle();
        Assert.assertEquals(titleName,"OrangeHRM");
    }
    @Test(priority = 1)
    void logintitle(){
        driver= new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement logElement= driver.findElement(By.cssSelector("h5.orangehrm-login-title"));
        String logTxt= logElement.getText();
        Assert.assertEquals(logTxt,"Login");
    }
}

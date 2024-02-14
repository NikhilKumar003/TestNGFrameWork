import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class parameterExample {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app){
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        driver.get(app);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test(priority = 4,enabled = false)
    void logoTest(){
        WebElement Logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(Logo.isEnabled());
    }
    @Test(priority = 1)
    void title(){
        String urlTitle= driver.getTitle();
        Assert.assertEquals(urlTitle, "OrangeHRM");
    }
    @Test(priority = 3,enabled = false)
    void verifyuser(){
        WebElement name= driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']"));
        Assert.assertEquals(name, "Username : Admin");

    }
    @Test(priority = 2)
    void VerifyURL(){
       WebElement loginText= driver.findElement(By.cssSelector("h5.orangehrm-login-title"));
        String logintxt= loginText.getText();
       Assert.assertEquals(logintxt,"Login");
//       int a = loginText.getSize();
//       Assert.assertEquals(0,a);
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }

}

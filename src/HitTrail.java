import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HitTrail {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement ll=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        ll.isEnabled();
//        driver.findElement(By.)
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTest {
    @Test(priority = 0)
    void setup(){

        System.out.println("open browser");
    }
    @Test(priority = 1)
    void searchCustomer(){
        System.out.println("Search name in website");
    }
    @Test(priority = 2)
    void addCustomer(){
        System.out.println("Add name in website");
        Assert.assertEquals(4,4);
    }
}

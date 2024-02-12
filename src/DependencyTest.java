import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test()
    void startCar(){
        System.out.println("start the car");
        Assert.assertEquals(3,3);
    }
    @Test(priority = 1,dependsOnMethods = {"startCar"})
    void runCar(){
        System.out.println("Run the car");
    }
    @Test(priority = 2,dependsOnMethods = {"runCar"})
    void parkCar(){
        System.out.println("Park the car");
        Assert.assertEquals(2,2);
    }
    @Test(priority = 3,dependsOnMethods = {"runCar","parkCar"},alwaysRun = true)
    void stopCar(){
        System.out.println("Stop the car");
    }
}

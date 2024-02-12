import org.testng.annotations.Test;

public class DependencyTest {
    @Test(priority = 0)
    void startCar(){
        System.out.println("start the car");
    }
    @Test(priority = 1)
    void runCar(){
        System.out.println("Run the car");
    }
    @Test(priority = 2,enabled = false)
    void parkCar(){
        System.out.println("Park the car");
    }
    @Test(priority = 3)
    void stopCar(){
        System.out.println("Stop the car");
    }
}

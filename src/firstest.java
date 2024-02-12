import org.testng.annotations.Test;

public class firstest {

    @Test(priority = 0)
    void setup(){

        System.out.println("open browser");
    }
    @Test(priority = 1)
    void login(){
        System.out.println("login to website");
    }
    @Test(priority = 2)
    void teardown(){
        System.out.println("close the browser");
    }
}

import org.testng.annotations.*;

public class TC1 {
  @Test
    void test1(){
        System.out.println("this is test1");
    }
    @Test
    void test2(){
        System.out.println("this is test2");
    }
    @BeforeMethod
    void beforeTest1(){
        System.out.println("this is beforeTest");
    }
    @AfterMethod
    void afterTest1(){
        System.out.println("this is afterTest");
    }
    @BeforeClass
    void beforeClass() { System.out.println("this is before class"); }
    @AfterClass
    void afterClass(){System.out.println("this is after class"); }
    @BeforeTest
    void beforeTest(){System.out.println("this is before test main"); }
    @AfterTest
    void afterTest(){System.out.println("this is after test main"); }
}

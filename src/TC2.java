import org.testng.annotations.*;

public class TC2 {
  @Test
    void test3(){
        System.out.println("this is test3");
    }
    @Test
    void test4(){
        System.out.println("this is test4");
    }
    @BeforeMethod
    void beforeTest(){
        System.out.println("this is beforeTest");
    }
    @AfterMethod
    void afterTest(){
        System.out.println("this is afterTest");
    }

    @BeforeClass
    void beforeClass() { System.out.println("this is before class"); }
    @AfterClass
    void afterClass(){System.out.println("this is after class"); }

    @BeforeSuite
    void beforeSuite(){System.out.println("this is before Suite"); }
    @AfterSuite
    void afterSuite(){System.out.println("this is after Suite"); }
}


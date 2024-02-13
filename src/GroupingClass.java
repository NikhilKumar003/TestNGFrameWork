import org.testng.annotations.Test;

public class GroupingClass {
    @Test(groups={"sanity"})
    void test1(){
        System.out.println("this is test 1");
    }
    @Test(groups={"sanity"})
    void test2(){
        System.out.println("this is test 2");
    }
    @Test(groups={"regression"})
    void test3(){
        System.out.println("this is test 3");
    }
    @Test(groups={"sanity","regression"})
    void test4(){
        System.out.println("this is test 4");
    }
    @Test(groups={"UAT"})
    void test5(){
        System.out.println("this is test 5");
    }
}

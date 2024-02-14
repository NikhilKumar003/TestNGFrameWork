import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    @Test(dataProvider = "loginData",dataProviderClass = customDataprovider.class)
    public  void loginTest(String uname, String pwd){
        System.out.println(uname+"  "+ pwd);

    }


}

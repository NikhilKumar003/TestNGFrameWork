import org.testng.annotations.DataProvider;

public class customDataprovider {
    @DataProvider(name = "loginData")
    public Object[][] getdata() {

        Object[][] data= {{"adc.gmail.com","psw234"},{"adsf.gmail.com","psw4343"},{"wqwqewe@mvdd.com","wqe434"}};
        return data;
    }
}
